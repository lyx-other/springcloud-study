package com.springboot.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Beans
{
	@Bean("restTemplate")
	@LoadBalanced
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
}