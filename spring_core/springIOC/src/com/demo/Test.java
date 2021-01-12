package com.demo;

import java.util.List;

public class Test {

	private int age;
	private String name, email, gender;
	private int marks[];
	private List<String> fruits;
	private Test() {
		System.out.println("Test Contructed....");
	}
	private Test(String name, int age, String email) {
		this.name=name;
		this.age=age;
		this.email=email;
	}
	
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}
	public void sayHello(String name) {
		System.out.println("Hello..." + gender + "...." + name);
	}
	public void print() {
		System.out.println("name: " + name + ", age: " + age + ", email: " + email);
	}
	public void printMarks() {
		for(int m: marks) {
			System.out.println(m);
		}
	}
	public void printFruits() {
		fruits.forEach(System.out::println);
	}
}
