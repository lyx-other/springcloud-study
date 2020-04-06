package com.payment.controller;

import com.payment.entity.Payment;
import com.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class TestController
{
	@Autowired
	@Qualifier("paymentServiceImpl")
	private PaymentService service;

	@GetMapping("/foo")
	public String foo()
	{
		service.save(new Payment(null, UUID.randomUUID().toString()));
		service.save(new Payment(null, UUID.randomUUID().toString()));
		service.save(new Payment(null, UUID.randomUUID().toString()));

		return "测试成功";
	}
}