package com.client;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;
import com.service.StudentService;

public class ClientSpringJDBC {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring-jdbc.xml");
		StudentService studentService = (StudentService)ctx.getBean("studentService");
		List<Student> students = studentService.findAll();
		students.forEach(System.out::println);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(studentService.findById(1));
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		List<Student> studentsByParam = studentService.findByParam(new Object[]{"Bhrikutinagar", "Nepalgunj"});
		studentsByParam.forEach(System.out::println);
		
	}

}
