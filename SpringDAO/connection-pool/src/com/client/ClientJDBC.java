package com.client;

import java.util.List;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.model.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;

public class ClientJDBC {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
		StudentService studentService = (StudentServiceImpl) ctx.getBean("studentService");
		List<Student> students = studentService.findAll();
		students.forEach(System.out::println);
	}

}
