package com.factoryMethod.factoryVendor;

public class CarFactoryInstance {

	private String carName;
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public  Car getCar() {
		Car c = null;
		try {
							//fully qualified class name i.e. with package name
			c = (Car) Class.forName("com.factoryMethod.implVendor."+carName).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return c;
	}
}
