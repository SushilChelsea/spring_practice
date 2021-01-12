package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abstract_class.Bus;
import com.concrete_class.Truck;
import com.inter_face.Car;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("lookup.xml");
		
		//lookup for interface
		Car c = (Car) ctx.getBean("c");
		System.out.println(c.getClass().getName());
		System.out.println(c.myCarEngine().getName());
		
		System.out.println("==============================================");
		//lookup for abstract class
		Bus b = (Bus) ctx.getBean("b");
		System.out.println(b.getClass().getName());
		System.out.println(b.myBusEngine().getName());
		
		System.out.println("==============================================");
		//lookup for abstract class
		Truck t = (Truck) ctx.getBean("t");
		System.out.println(t.getClass().getName());
		System.out.println(t.myTruckEngine().getName());
		
	}
}
