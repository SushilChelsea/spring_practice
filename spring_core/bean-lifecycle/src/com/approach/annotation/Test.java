package com.approach.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Test {

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	@PostConstruct
	public void init() throws Exception {
		System.out.println("init method");
		System.out.println("property->name: " + name);
	}
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("destroy method");
	}
}
