package com.lyx;

import com.springboot.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController
{
	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/foo")
	public ResponseBean foo()
	{
		List<ServiceInstance> instances = discoveryClient.getInstances("M3");
		instances.stream().forEach(i ->{
			System.out.println(i.getInstanceId());
		});

		return ResponseBean.successMsg("成功了");
	}
}