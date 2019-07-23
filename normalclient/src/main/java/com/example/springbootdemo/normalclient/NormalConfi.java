package com.example.springbootdemo.normalclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class NormalConfi {

	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
