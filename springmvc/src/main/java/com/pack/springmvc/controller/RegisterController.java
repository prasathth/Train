package com.pack.springmvc.controller;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pack.springmvc.service.EmployeeService;
import com.pack.springmvc.model.Employee;
	
@Controller
@RequestMapping("/employee")
public class RegisterController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/alert")
	public String alert() {
		return "alert";
	}

	@GetMapping("/{id}")
	public String displayId(@PathVariable("id") int id , Model map)
	{
		Employee ea = employeeService.findById(id);
		map.addAttribute("e",ea);
		return "findbyid";
	}
	
	@GetMapping("/list")
	public String showAll(Model map) {
		
		//List<Employee> emp = new ArrayList<>();
		//emp.add(new Employee(1,"kumar",3,3));
		map.addAttribute("empAll",employeeService.showAll());
		return "display";
	}
	@GetMapping("/register")
	public String registerform(Model map)
	{
		map.addAttribute("emp", new Employee());
		return "register";
	}	
	@PostMapping("/register")
	public String registerempl(@Valid @ModelAttribute("emp")Employee emp,BindingResult re)
	{
		if(re.hasErrors())
			return "register";
		System.out.println(emp);
		if(employeeService.insertEmployee(emp)==1)
			return "succ";
		else
			return "failedregistration";
	}

	@GetMapping("/deletebyid/{id}")
	public String deletebyid(@PathVariable("id") int i,Model m)
	{
		Employee e = employeeService.findById(i);
		m.addAttribute("e",e);
		return "del"; 
	}
	@PostMapping("/deletebyid/{id}")
	public String delete(@ModelAttribute("e") Employee e)
	{
		int n = employeeService.deleteEmployee(e.getId());
		if(n==1)
			return "success_del";
		else
			return "failed_del";
	}
}
