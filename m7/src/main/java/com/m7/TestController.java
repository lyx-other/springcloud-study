package com.m7;

import com.common.ResponseBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@GetMapping("/foo")
	ResponseBean foo()
	{
		return ResponseBean.successMsg("这是 m7 模块的 foo() 方法");
	}
}