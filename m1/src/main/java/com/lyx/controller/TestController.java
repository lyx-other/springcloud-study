package com.lyx.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.lyx.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class TestController
{
	@Autowired
	@Qualifier("restTemplate")
	private RestTemplate restTemplate;

	@GetMapping("/foo")
	public ResponseBean foo()
	{
		System.out.printf("执行了m1模块的foo方法");

		return restTemplate.getForObject("http://127.0.0.1/foo", ResponseBean.class);
	}
}