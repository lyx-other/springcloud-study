package com.m6;

import cn.hutool.core.util.IdUtil;
import com.common.ResponseBean;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@GetMapping("/foo")
	public ResponseBean foo()
	{
		return ResponseBean.successMsg("这是m6模块的foo方法");
	}

	@GetMapping("/fun1")
	public ResponseBean fun1()
	{
		return ResponseBean.successMsg("这是m6模块的fun1方法");
	}

	@GetMapping("/fun2")
	public ResponseBean fun2()
	{
		return ResponseBean.successMsg("这是m6模块的fun2方法");
	}

	@GetMapping("/fun3")
	public ResponseBean fun3()
	{
		int a = 10 / 0;

		return ResponseBean.successMsg("这是m6模块的fun3方法");
	}

	@GetMapping("/user/{id}")
	@HystrixCommand(fallbackMethod = "error")
	public ResponseBean getById(@PathVariable("id") int id)
	{
		if (id <= 0)
		{
			throw new RuntimeException("异常：id不能为负数");
		}

		return ResponseBean.successData("id为 " + id + " 的用户，流水号：" + IdUtil.simpleUUID());
	}

	// ---------------------------------

	public ResponseBean error(int id)
	{
		return ResponseBean.errorMsg("接口发生错误，你传入的id为：" + id);
	}
}