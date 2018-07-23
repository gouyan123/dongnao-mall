package com.dongnaoedu.mall.content;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.dubbo.container.Main;

//@Configuration
//@EnableApolloConfig
@SpringBootApplication
@EnableTransactionManagement
//@EnableScheduling
@ComponentScan(value = {"com.dongnaoedu.mall"})
@MapperScan(basePackages = "com.dongnaoedu.mall.manager.mapper")
public class ContentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentApplication.class, args);
	}
}
