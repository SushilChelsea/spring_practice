package com.sushil.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sushil.bean.ConnectionPool;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ConnectionPool c = (ConnectionPool) ctx.getBean("cp");
		System.out.println(c);

	}

}
