package com.dubbo.soa.all;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.dubbo.soa.all.dao")
@ImportResource(value = {"classpath:dubbo-reference.xml"})
@ComponentScan("com.dubbo.soa.all")
public class SoaAllApplication {


		
	public static void main(String[] args) {
		System.out.println("==============开始启动=================");
		SpringApplication.run(SoaAllApplication.class, args);
		System.out.println("==============启动结束=================");
	}
}
