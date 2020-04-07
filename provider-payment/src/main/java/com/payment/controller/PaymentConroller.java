package com.payment.controller;

import com.lyx.ResponseData;
import com.payment.entity.Payment;
import com.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentConroller
{
	@Autowired
	@Qualifier("paymentServiceImpl")
	private PaymentService service;

	@GetMapping("/list")
	public ResponseData<List<Payment>> list()
	{
		return ResponseData.successData(service.list());
	}
}