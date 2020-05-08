package com.m1;

import com.common.ResponseBean;
import com.m1.openfeign.M3Feign;
import com.m1.openfeign.M5Feign;
import com.m1.openfeign.M6Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@Autowired
	@Qualifier("m3feign")
	private M3Feign m3Feign;

	@Autowired
	@Qualifier("m5feign")
	private M5Feign m5Feign;

	@Autowired
	@Qualifier("m6feign")
	private M6Feign m6Feign;

	@GetMapping("/m1foo")
	public ResponseBean foo()
	{
		return m6Feign.foo();
	}

	@GetMapping("m1fun3")
	public ResponseBean fun3()
	{
		return m6Feign.fun3();
	}
}