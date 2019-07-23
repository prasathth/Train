package com.springboot.dbdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudController {

	@Autowired
	private StudentDAO obj;
	
	@RequestMapping
	public String get()
	{
		return "first.jsp";
	}
	
	@RequestMapping("/addstud")
	public String add(Student stud)
	{
		obj.save(stud);
		return "first.jsp";
	}
}
