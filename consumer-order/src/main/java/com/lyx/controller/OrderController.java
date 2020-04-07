package com.lyx.controller;

import com.lyx.ResponseData;
import com.lyx.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class OrderController
{
	@Autowired
	@Qualifier("restTemplate")
	private RestTemplate restTemplate;

	@GetMapping("/foo")
	public ResponseData foo()
	{
		ResponseData<List<Payment>> object = restTemplate.getForObject("http://127.0.0.1:8081/list", ResponseData.class);

		System.out.println(object.getData().getClass().getName());

		return ResponseData.successData(object);
	}
}