package com.pack.springmvc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pack.springmvc.model.Employee;

@Repository(value = "mysqlDaoImpl")
public class MySQLEmployeeDAOImpl implements EmployeeDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int insert(Employee employee) {
		String query = "insert into employee values('" + employee.getId() + "','" + employee.getName() + "','"+ employee.getAge() + "','" + employee.getSalary() + "')";
		System.out.println("Insert Employee in MySQL DAO");
		
		return jdbcTemplate.update(query);
	}

	public void update(Employee e) {
		String query = "update employee set name= ? where id= ?";
		jdbcTemplate.update(query,e.getName(),e.getId());
		
	}

	public int deleteEmployee(int id) {
		String query = "delete from employee where id= ? ";
		return jdbcTemplate.update(query,id);
		
	}

public List<Employee> showAll() {
		/*
		String sql = "SELECT * FROM employee";
		 
		List<Employee> customers = new ArrayList<Employee>();
		
		List<Map> rows = jdbcTemplate.queryForList(sql);
		for (Map row : rows) {
			Employee customer = new Employee();
			customer.setId((int)(row.get("ID")));
			customer.setName((String)row.get("NAME"));
			customer.setAge((int)row.get("AGE"));
			customer.setSalary((float)row.get("salary"));
			customers.add(customer);
		}
			
		return customers;
		*/
	List<Employee> empall = jdbcTemplate.query("select * from employee",
			(rs,rowNum)->new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getFloat(5)));
	
	
	return empall;
	}

@Override
public Employee findById(int id) {
	String query = "select * from employee where id = " +id ;
	
	return jdbcTemplate.queryForObject(query,
			(rs,rowNum) -> new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getFloat(5)));
}


}
