package com.springboot;

import com.springboot.openfeign.M3Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@Autowired
	private M3Feign m3Feign;

	@GetMapping("/m1foo")
	public ResponseBean foo()
	{
		return m3Feign.foo();
	}

	@GetMapping("/m1bar")
	public ResponseBean bar()
	{
		System.out.println("方法调用");

		return m3Feign.bar("test");
	}
}