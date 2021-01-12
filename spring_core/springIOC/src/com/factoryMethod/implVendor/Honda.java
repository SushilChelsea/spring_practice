package com.factoryMethod.implVendor;

import com.factoryMethod.factoryVendor.Car;

public class Honda implements Car{

	@Override
	public void drive() {
		System.out.println("Honda car driving");
	}
}
