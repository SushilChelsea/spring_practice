package com.components.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private Engine engine;
	private static String carName;

	public static void setCarName(String carName) {
		Car.carName = carName;
	}
	
	@Override
	public String toString() {
		return "Car [engine=" + engine.getModel() + ", carName=" + carName + "]";
	}
	
}
