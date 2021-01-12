package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.Car;

public class ClientCar {

	public static void main(String[] args) {
		/*
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/car.xml", "resources/engine.xml");
		Car c = (Car) context.getBean("c");
		System.out.println(c);
		*/
		/*
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/p&cNS.xml");
		Car c = (Car) context.getBean("c");
		System.out.println(c);
		*/
		
		// using @Autowired annotation
		// for primitive type manual injection
		// for reference type IOC will inject just annotate it
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/autowire.xml");
		Car c = (Car) context.getBean("c");
		System.out.println(c);
		
		
	}

}
