package com.components.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCar {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("resources/component-scan.xml");
		Car c = (Car) context.getBean(Car.class);
		System.out.println(c);
		
		
	}

}
