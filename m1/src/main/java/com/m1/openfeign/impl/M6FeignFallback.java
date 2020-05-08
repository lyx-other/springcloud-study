package com.m1.openfeign.impl;

import com.common.ResponseBean;
import com.m1.openfeign.M6Feign;
import org.springframework.stereotype.Component;

@Component("m6FeignFallback") // 必须要在 IOC 中添加bean
public class M6FeignFallback implements M6Feign
{
	@Override
	public ResponseBean foo()
	{
		return ResponseBean.errorMsg("foo接口有错误");
	}

	@Override
	public ResponseBean fun1()
	{
		return ResponseBean.errorMsg("fun1接口有错误");
	}

	@Override
	public ResponseBean fun2()
	{
		return ResponseBean.errorMsg("fun2接口有错误");
	}

	@Override
	public ResponseBean fun3()
	{
		return ResponseBean.errorMsg("fun3接口有错误");
	}
}