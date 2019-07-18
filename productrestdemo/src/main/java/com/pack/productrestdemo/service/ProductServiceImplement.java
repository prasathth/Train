package com.pack.productrestdemo.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.pack.productrestdemo.dao.ProductDAO;
import com.pack.productrestdemo.model.Product;
@Service(value = "productService")

public class ProductServiceImplement implements ProductService {

	private ProductDAO productdao; 
	
	public ProductServiceImplement(ProductDAO productdao) {
		super();
		this.productdao = productdao;
	}

	public int saveProduct(Product product) {
		System.out.println("save");
		return productdao.saveProduct(product);
		
	}

	public int updateProduct(int id,Product product) {
		System.out.println("upd");
		return productdao.updateProduct(id , product);
		
	}

	public int deleteProduct(int id) {
		// TODO Auto-generated method stub
		System.out.println("delete");
		return productdao.deleteProduct(id);
		
	}

	public List<Product> list() {
		List<Product> product = productdao.list();
		return product;
	}

	@Override
	public Product findBy(int id) {

		return productdao.findBy(id);
	}

}
