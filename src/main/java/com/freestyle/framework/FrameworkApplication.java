package com.freestyle.framework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@MapperScan("com.freestyle.framework.dao")
@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)// 参数设置为true，使AopContext.currentProxy()能够使用，来解决aop注解方法被内部调用的问题
public class FrameworkApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(FrameworkApplication.class, args);
	}
}
