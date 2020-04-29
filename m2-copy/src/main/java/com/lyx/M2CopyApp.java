package com.lyx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class M2CopyApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(M2CopyApp.class, args);
	}
}