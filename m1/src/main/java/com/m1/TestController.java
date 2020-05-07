package com.m1;

import com.common.ResponseBean;
import com.m1.openfeign.M3Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	/**
	 * 注入要调用模块的 feign接口实例
	 */
	@Autowired
	@Qualifier("m3feign")
	private M3Feign m3Feign;

	@GetMapping("/m1foo")
	public ResponseBean foo()
	{
		return m3Feign.foo(); // 调用就可以了
	}

	@GetMapping("/m1bar")
	public ResponseBean bar()
	{
		return m3Feign.bar("test"); // 调用就可以了
	}
}