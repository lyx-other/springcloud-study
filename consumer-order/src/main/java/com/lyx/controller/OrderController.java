package com.lyx.controller;

import com.lyx.ResponseData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController
{
	@GetMapping("/foo")
	public ResponseData<String> foo()
	{
		return ResponseData.successMsg("成功了");
	}
}