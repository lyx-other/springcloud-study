package com.payment.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.payment.entity.Payment;
import com.payment.mapper.PaymentMapper;
import org.springframework.stereotype.Service;

@Service("paymentServiceImpl")
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService
{
}