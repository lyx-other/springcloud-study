package com.m1.openfeign;

import com.common.ResponseBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "M3", qualifier = "m3feign")
public interface M3Feign
{
	@GetMapping("/foo")
	ResponseBean foo();

	@GetMapping("/bar/{parameter}")
	ResponseBean bar(@PathVariable("parameter") String parameter);
}