package com.springboot.openfeign;

import com.springboot.ResponseBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("M3")
public interface M3Feign
{
	@GetMapping("/foo")
	ResponseBean foo();

	@GetMapping("/bar/{parameter}")
	ResponseBean bar(@PathVariable("parameter") String parameter);
}