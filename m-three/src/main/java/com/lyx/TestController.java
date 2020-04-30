package com.lyx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@Value("${server.port}")
	private String port;

	@GetMapping("/foo")
	public ResponseBean foo()
	{
		return ResponseBean.successMsg("是这m-three模块的 foo 接口，使用的接口是 " + port);
	}
}