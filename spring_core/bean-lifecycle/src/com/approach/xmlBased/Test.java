package com.approach.xmlBased;

public class Test {

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public void init() throws Exception {
		System.out.println("init method");
		System.out.println("property->name: " + name);
	}
	public void destroy() throws Exception {
		System.out.println("destroy method");
	}
}
