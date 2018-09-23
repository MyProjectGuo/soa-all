package com.dubbo.soa.all.soaall;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dubbo.soa.all.SoaAllApplication;
import com.dubbo.soa.all.utils.TokenUtils;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SoaAllApplication.class)
public class RedisServiceTest {

	
	@Autowired
	@Qualifier("stringRedisTemplate")
	private StringRedisTemplate template;
	
	
	
	@Autowired
	@Qualifier("redisTemplate")
	private RedisTemplate<String, String> redisTemplate;
	

	@Test
	public void testRedis(){
		
		redisTemplate.opsForValue().set(TokenUtils.getUUIDToken(), "15921705403");
	}
	
	
}
