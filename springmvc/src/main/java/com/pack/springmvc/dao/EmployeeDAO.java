package com.pack.springmvc.dao;

import java.util.List;

import com.pack.springmvc.model.Employee;

public interface EmployeeDAO {

	public int insert(Employee employee);
	public List<Employee> showAll();

    public void update(Employee e);

    public int deleteEmployee(int id);
    
    public Employee findById(int id);
}
