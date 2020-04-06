package com.payment.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName("payment")
@NoArgsConstructor
@AllArgsConstructor
public class Payment
{
	@TableId(type = IdType.AUTO)
	private Long id;

	@TableField("order_serial")
	private String orderSerial;
}