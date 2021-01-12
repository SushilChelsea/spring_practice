package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	@Autowired
	@Qualifier("e")
	private Engine engine;
	private String carName;
	
	// No need to use constructor DI and setter DI in case of @Autowired
	
	/*public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}*/
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	@Override
	public String toString() {
		return "Car [engine=" + engine.getModel() + ", carName=" + carName + "]";
	}
	
}
