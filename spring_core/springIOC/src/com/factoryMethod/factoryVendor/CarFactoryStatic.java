package com.factoryMethod.factoryVendor;

public class CarFactoryStatic {

	private static String carName;
	
	public static String getCarName() {
		return carName;
	}
	public static void setCarName(String carName) {
		CarFactoryStatic.carName = carName;
	}
	public static Car getCar() {
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
