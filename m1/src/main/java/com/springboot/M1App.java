package com.springboot;

import com.ribbon.RibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
//@RibbonClient(name = "M-THREE", configuration = RibbonRule.class)
@RibbonClients
(
	{
		@RibbonClient(name = "M-THREE", configuration = RibbonRule.class),
		@RibbonClient(name = "m2", configuration = RibbonRule.class)
	}
)
public class M1App
{
	public static void main(String[] args)
	{
		SpringApplication.run(M1App.class, args);
	}
}