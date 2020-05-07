package com.m1.openfeign;

import com.common.ResponseBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "m5", qualifier = "m5feign")
public interface M5Feign
{
	@GetMapping("/foo")
	ResponseBean foo();
}