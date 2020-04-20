package com.woniuxy.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//开启事务管理
@EnableTransactionManagement
//自动生成所有dao包的接口
@MapperScan("com.woniuxy.springboot.dao")
@SpringBootApplication
public class Myspringboot3Application {

	public static void main(String[] args) {
		System.out.println("zs---bbbbb");
		SpringApplication.run(Myspringboot3Application.class, args);
	}

}
