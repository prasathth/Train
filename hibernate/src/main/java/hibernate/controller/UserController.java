package hibernate.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hibernate.service.UserService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
@RequestMapping("/api/v1/user")
//@EnableSwagger2
//@PropertySource("classpath:documentation.properties")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping(value="/",produces= { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})
	public String listAll()
	{
		System.out.println("prints");
		return "done";
	}
}