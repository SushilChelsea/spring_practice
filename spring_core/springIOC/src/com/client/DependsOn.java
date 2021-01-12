package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class A {
	B b;
	A() {
		System.out.println("A Object");
	}
	public void setB(B b) {
		this.b = b;
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
}
class B {
	C c;
	B() {
		System.out.println("B Object");
	}
	public void setC(C c) {
		this.c = c;
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "B [c=" + c + "]";
	}
}
class C {
	C() {
		System.out.println("C Object");
	}
}
public class DependsOn {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/depends-on.xml");
	}
}
