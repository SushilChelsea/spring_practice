package com.beanTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("resources/bean-template.xml");
		HelloWorld h = (HelloWorld)ctx.getBean(HelloWorld.class);
		System.out.println(h.getMessage1());
		System.out.println(h.getMessage2());
		System.out.println(h.getMessage3());
	}

}
