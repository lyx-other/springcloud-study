package com.m3;

import com.common.ResponseBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@Value("${server.port}")
	private String port;

	@GetMapping("/foo")
	public ResponseBean foo()
	{
		return ResponseBean.successMsg("是这m3模块的 foo 接口，使用的接口是 " + port);
	}

	@GetMapping("/bar/{parameter}")
	public ResponseBean bar(@PathVariable("parameter") String parameter)
	{
		return ResponseBean.successMsg("这是 m3 模块的bar接口，传过来的参数是：" + parameter);
	}
}