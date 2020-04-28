package com.common.controller;

import com.common.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController
{
	@Autowired
	@Qualifier("restTemplate")
	private RestTemplate restTemplate;

	@GetMapping("/foo")
	public String foo()
	{
		ResponseBean responseBean = restTemplate.getForObject("http://127.0.0.1:8081/foo", ResponseBean.class);

		return "这是m2模块，得到m1的数据：\n" + responseBean;
	}
}