package com.common.controller;

import com.common.ResponseBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
	@GetMapping("/foo")
	public ResponseBean foo()
	{
		return ResponseBean.successMsg("这是一个测试");
	}
}