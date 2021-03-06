package com.example.springbootdemo.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableEurekaClient
@SpringBootApplication
@RestController
public class MsMyserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMyserviceApplication.class, args);
	}
	@RequestMapping
	public String demoMethod()
	{
		return "<h4>from my service</h4>";
	}
}
