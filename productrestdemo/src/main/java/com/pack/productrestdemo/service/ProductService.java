package com.pack.productrestdemo.service;

import java.util.List;

import com.pack.productrestdemo.model.Product;

public interface ProductService {

	public int saveProduct(Product product);
	public int updateProduct(int id , Product product);
	public int deleteProduct(int id);
	public List<Product> list();
	public Product findBy(int id);
}
