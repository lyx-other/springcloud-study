package com.lyx;

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

	@GetMapping("/m1-visit-m2")
	public ResponseBean m1M2()
	{
		System.out.printf("执行了m1模块的 m1M2 方法");

		return restTemplate.getForObject("http://m2/foo", ResponseBean.class);
	}

	@GetMapping("/m1-visit-m3")
	public ResponseBean m1M3()
	{
		System.out.printf("执行了m1模块的 m1M3 方法");

		return restTemplate.getForObject("http://m-three/foo", ResponseBean.class);
	}
}