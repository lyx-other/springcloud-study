package com.m6;

import com.common.ResponseBean;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@GetMapping("/foo")
	@HystrixCommand
	(
		fallbackMethod = "error",
		commandProperties = { @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000") }
	)
	public ResponseBean foo()
	{
		int a = 3 / 0;

		return ResponseBean.successMsg("这是m6模块的foo方法");
	}

	public ResponseBean error()
	{
		return ResponseBean.errorMsg("接口有错误");
	}
}