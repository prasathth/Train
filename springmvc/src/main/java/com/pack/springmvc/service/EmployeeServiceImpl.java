package com.pack.springmvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pack.springmvc.dao.EmployeeDAO;
import com.pack.springmvc.model.Employee;

@Service(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;

	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public int insertEmployee(Employee employee) {
		System.out.println("Insert Employee in Employee Service");
		return employeeDAO.insert(employee);
	}

	public int deleteEmployee(int id) {
		System.out.println("delete Employee in Employee Service");
		return employeeDAO.deleteEmployee(id);
	}

	public void update(Employee e) {
		System.out.println("update Employee in Employee Service");
		employeeDAO.update(e);
		
	}

	public List<Employee> showAll() {
		
		List<Employee> e = employeeDAO.showAll();
		return e ;
	}

	@Override
	public Employee findById(int id) {
		Employee a = employeeDAO.findById(id);
	
		return a ;
	}

	
	
	

}
