package com.pack.productrestdemo.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.productrestdemo.model.Product;
import com.pack.productrestdemo.service.ProductService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
@RequestMapping("/api/v1/product")
//@EnableSwagger2
@PropertySource("classpath:documentation.properties")
public class ProductsController {
	
	@Autowired
	private ProductService productservice;
	
	
	@GetMapping(value="/",produces= { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})
	public List<Product> listAll()
	{
		List<Product> products = productservice.list();
		for(Product p : products)
			System.out.println(p);
		return products;
	}
	
	
	@GetMapping(value="/{id}",consumes= { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})
	public Product findById(@PathVariable int id)
	{
		Product p = productservice.findBy(id);
		System.out.println(p);
		return p;
	}
	
	
	@PostMapping(value="/save",consumes= { APPLICATION_JSON_VALUE , APPLICATION_XML_VALUE})
	public String saveProduct(@Valid @RequestBody Product product)
	{
		System.out.println("here save");
		if(productservice.saveProduct(product)==1)
			return "success";
		else
			return "failed";
	}
	
	
	@PutMapping(value="/update/{id}",consumes= { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})
	public String updateProduct(@PathVariable int id,@RequestBody Product product)
	{
		System.out.println("here update");
		if(productservice.updateProduct(id,product)==1)
			return "success";
		else
			return "failed";
	}
	
	@DeleteMapping(value="/delete/{id}")
	public String deleteProduct(@PathVariable int id)
	{
		System.out.println("del product");
		if(productservice.deleteProduct(id)==1)
			return "done";
		else
			return "do";
	}
}
