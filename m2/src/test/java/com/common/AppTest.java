package com.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest
{
	@Autowired
	@Qualifier("restTemplate")
	private RestTemplate template;

	@Test
	public void test1()
	{
		ResponseEntity<String> responseEntity = template.getForEntity("https://www.baidu.com", String.class);

		System.out.println(responseEntity.getBody());
	}
}