package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.Test;

public class ClientClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
		Test t = (Test)context.getBean("t");
		//t.sayHello("durga");
		t.printFruits();
	}

}
