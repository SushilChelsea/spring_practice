package com.factoryMethod.implVendor;

import com.factoryMethod.factoryVendor.Car;

public class Audi implements Car{

	@Override
	public void drive() {
		System.out.println("Audi car driving");
	}

}
