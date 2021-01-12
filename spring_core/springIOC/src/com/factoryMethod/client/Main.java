package com.factoryMethod.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.factoryMethod.factoryVendor.Car;

public class Main {
	public static void main(String[] args) {
		/*
		//static factory method
		ApplicationContext context = new ClassPathXmlApplicationContext("factory_resource/static-factory.xml");
		Car c = (Car) context.getBean("cf");
		c.drive();
		*/
		/*
		// instance factory method
		ApplicationContext context = new ClassPathXmlApplicationContext("factory_resource/instance-factory.xml");
		Car c = (Car) context.getBean("c");
		c.drive();
		*/
		
		//implementing spring bean factory
		ApplicationContext context = new ClassPathXmlApplicationContext("factory_resource/bean-factory.xml");
		Car c = (Car) context.getBean("cf");
		Car c1 = (Car) context.getBean("cf");
		c.drive();
		c1.drive();
		System.out.println(c==c1);
		System.out.println(c.hashCode() + "\t" + c1.hashCode());
	}
}
