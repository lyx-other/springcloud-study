package com.m6;

import com.common.ResponseBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@GetMapping("/foo")
	public ResponseBean foo()
	{
		return ResponseBean.successMsg("这是m6模块的foo方法");
	}

	@GetMapping("/fun1")
	public ResponseBean fun1()
	{
		return ResponseBean.successMsg("这是m6模块的fun1方法");
	}

	@GetMapping("/fun2")
	public ResponseBean fun2()
	{
		return ResponseBean.successMsg("这是m6模块的fun2方法");
	}

	@GetMapping("/fun3")
	public ResponseBean fun3()
	{
		int a = 10 / 0;

		return ResponseBean.successMsg("这是m6模块的fun3方法");
	}
}