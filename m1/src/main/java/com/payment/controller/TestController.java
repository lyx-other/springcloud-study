package com.payment.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.lyx.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController
{
	// 注入一個 org.springframework.cloud.client.discovery.DiscoveryClient 對象
	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/discover")
	public ResponseBean discover()
	{
		// 獲取所有的 serviceId
		List<String> serviceIds = discoveryClient.getServices();
		System.out.println("获得services：");
		serviceIds.forEach(System.out::println);
		System.out.println("-----------------\n");

		// 根據某個servicesId獲取這個服務下所有的 實例
		List<ServiceInstance> instances = discoveryClient.getInstances(serviceIds.get(0));
		System.out.println("获得instances：");
		for (int i = 0; i <= instances.size()-1; i++)
		{
			System.out.println("第" + (i+1) + "个实例，主机：" + instances.get(i).getHost());
			System.out.println("第" + (i+1) + "个实例，instanceId：" + instances.get(i).getInstanceId());
			System.out.println("第" + (i+1) + "个实例，元数据：" + instances.get(i).getMetadata());
			System.out.println("第" + (i+1) + "个实例，端口：" + instances.get(i).getPort());
			System.out.println("第" + (i+1) + "个实例，uri：" + instances.get(i).getUri());
		}
		System.out.println("-----------------\n");

		// 看看這個對象裏邊是什麼
		System.out.println("这个对象：");
		System.out.println(JSON.toJSONString(discoveryClient, SerializerFeature.PrettyFormat));

		return ResponseBean.successData("成功");
	}

	@GetMapping("/foo")
	public ResponseBean foo()
	{
		return ResponseBean.successMsg("这是一个测试");
	}
}