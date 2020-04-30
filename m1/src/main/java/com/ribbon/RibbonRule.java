package com.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonRule
{
	// 一个类只配置这么一个bean
	// 因为在后边添加的时候用到的时 类的名称 而不是bean的名称
	@Bean("iRule")
	public IRule getRule()
	{
		return new RandomRule();
	}
}