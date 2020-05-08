package com.m1.openfeign;

import com.common.ResponseBean;
import com.m1.openfeign.impl.M6FeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// 将 @FeignClient 注解的 fallback 属性指定为实现类
@FeignClient(value = "m6", qualifier = "m6feign", fallback = M6FeignFallback.class)
public interface M6Feign
{
	@GetMapping("/foo")
	ResponseBean foo();

	@GetMapping("/fun1")
	ResponseBean fun1();

	@GetMapping("/fun2")
	ResponseBean fun2();

	@GetMapping("/fun3")
	ResponseBean fun3();
}