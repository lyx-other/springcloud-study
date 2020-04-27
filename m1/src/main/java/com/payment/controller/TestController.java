package com.payment.controller;

import com.lyx.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController
{
	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/discover")
	public ResponseBean discover()
	{
		List<String> services = discoveryClient.getServices();
		return ResponseBean.successData(discoveryClient);
	}

	@GetMapping("/foo")
	public ResponseBean foo()
	{
		return ResponseBean.successMsg("这是一个测试");
	}
}