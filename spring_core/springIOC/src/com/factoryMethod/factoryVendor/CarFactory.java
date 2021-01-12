package com.factoryMethod.factoryVendor;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean<Car> {

private String carName;
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	@Override
	public Car getObject() throws Exception {
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

	@Override
	public Class<Car> getObjectType() {
		return Car.class;
	}
	
	public boolean isSingleton() {
		return false;
	}

}
