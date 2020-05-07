package com.m1.openfeign;

import com.common.ResponseBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "m6", qualifier = "m6feign")
public interface M6Feign
{
	@GetMapping("/foo")
	ResponseBean foo();
}