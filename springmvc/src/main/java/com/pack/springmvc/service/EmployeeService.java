package com.pack.springmvc.service;

import java.util.List;

import com.pack.springmvc.model.Employee;

public interface EmployeeService {

	public int insertEmployee(Employee employee);
	public int deleteEmployee(int id);
	public void update(Employee e);
	
	public List<Employee> showAll();
	public Employee findById(int id);
}
