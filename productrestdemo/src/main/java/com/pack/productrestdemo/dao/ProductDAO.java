package com.pack.productrestdemo.dao;

import java.util.List;

import com.pack.productrestdemo.model.Product;

public interface ProductDAO {
	public int saveProduct(Product product);
	public int deleteProduct(int id);
	public int updateProduct(int id ,Product product);
	public List<Product> list();
	public Product findBy(int id);
}
