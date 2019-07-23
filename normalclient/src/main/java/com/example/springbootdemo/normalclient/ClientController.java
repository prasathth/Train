package com.example.springbootdemo.normalclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest")
public class ClientController {
	
	@Autowired
	private RestTemplate restTemp;
	
	@GetMapping("/service")
	public String invokeserv()
	{
		System.out.println(restTemp);
		//String url="http://localhost:8789/rest/client/callservice";
		String url="http://MY_SERVICE:8788";
		return restTemp.getForObject(url,String.class);
//		return "user";
	}
}
