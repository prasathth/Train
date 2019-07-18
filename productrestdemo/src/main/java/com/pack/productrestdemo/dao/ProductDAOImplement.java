package com.pack.productrestdemo.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pack.productrestdemo.model.Product;


@Repository(value = "productDAO")
public class ProductDAOImplement implements ProductDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int saveProduct(Product product) {
		String query = "insert into product_table values('" + product.getId() + "','" + product.getName() + "','"+ product.getPrice() + "')";
		System.out.println("Insert Employee in MySQL DAO");
		
		return jdbcTemplate.update(query);
	}

	public int updateProduct(int id,Product product) {
		String query = "update product_table set name= ? where id= ?";
		return jdbcTemplate.update(query,product.getName(),id);
		
	}

	public int deleteProduct(int id) {
		String query = "delete from product_table where id= ? ";
		return jdbcTemplate.update(query,id);
		
	}

	public List<Product> list() {
		List<Product> pro = jdbcTemplate.query("select * from product_table",
				(rs,rowNum)->new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3)));
		
		
		return pro;
	}

	@Override
	public Product findBy(int id) {
		String query = "select * from product_table where id = " +id ;
		
		return jdbcTemplate.queryForObject(query,
				(rs,rowNum) -> new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3)));

	}


}
