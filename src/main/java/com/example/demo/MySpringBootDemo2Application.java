package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MySpringBootDemo2Application {

	public static void main(String[] args) {
	ApplicationContext context	= SpringApplication.run(MySpringBootDemo2Application.class, args);
	String [] beanNames = context.getBeanDefinitionNames();
	for(String bean:beanNames)
	{
		System.out.println(bean);
		
	}
	System.out.println(context.getBean("adminConfiguration").toString());//for single bean
	//context.getBeanNamesForType(User.class);//for multiple beans used this syntax
	}
	
	@Bean
	public User getuser()
	{
		return new User(1,"pooja");
	}

}
