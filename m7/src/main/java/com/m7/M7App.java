package com.m7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class M7App
{
	public static void main(String[] args)
	{
		SpringApplication.run(M7App.class, args);
	}
}