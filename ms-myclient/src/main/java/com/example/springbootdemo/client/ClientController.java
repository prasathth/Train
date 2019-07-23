package com.example.springbootdemo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/rest/client")
public class ClientController {


	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/demo")
	public String demo()
	{
		return "Hi client";
	}
	
	@HystrixCommand(fallbackMethod="change")
	@GetMapping("/callservice")
	public String callService()
	{
		String url="http://DEMO-SERVICE:8788";
		return restTemplate.getForObject(url, String.class);
	}
	
	public String change()
	{
		return "<h4>Service down</h4>";
	}
}
