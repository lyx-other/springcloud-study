package com.m6;

import com.common.ResponseBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController
{
	@GetMapping("/commonError")
	public ResponseBean commonError()
	{
		return ResponseBean.errorMsg("接口有错误");
	}
}