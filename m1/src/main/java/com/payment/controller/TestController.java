package com.payment.controller;

import com.lyx.ResponseBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@GetMapping("/foo")
	public ResponseBean foo()
	{
		return ResponseBean.successMsg("这是一个测试");
	}
}