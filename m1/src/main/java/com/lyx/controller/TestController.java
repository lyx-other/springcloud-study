package com.lyx.controller;

import com.lyx.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController
{
	private static final String PAYMENT_URL = "http://M2";

	@Autowired
	@Qualifier("restTemplate")
	private RestTemplate restTemplate;

	@GetMapping("/foo")
	public ResponseBean foo()
	{
		System.out.printf("执行了m1模块的foo方法");

		return restTemplate.getForObject(PAYMENT_URL + "/foo", ResponseBean.class);
	}
}