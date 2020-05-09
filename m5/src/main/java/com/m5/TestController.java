package com.m5;

import com.common.ResponseBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@GetMapping("/foo")
	public ResponseBean foo() throws InterruptedException
	{
		return ResponseBean.successMsg("这是m5模块的foo方法");
	}
}