package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;
import com.dao.StudentDaoJTImp;
import com.dao.StudentDaoImpl;
import com.model.Student;

public class Client {

	public static void main(String[] args) throws Exception {
		Student s1 = new Student();
		s1.setIdStudent(4);
		s1.setName("Aarav");
		s1.setArea("21 Baker Street");
		s1.setArea("London");
		s1.setPincode("5540");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		/*
		StudentDao dao = (StudentDaoImpl) ctx.getBean("studentDao");
		dao.save(s1);
		dao.update(s1);
		dao.findById(2);
		*/
		
		StudentDao dao = (StudentDaoJTImp) ctx.getBean("dao");
		dao.save(s1);
		dao.update(s1);
		dao.findById(2);
		
	}

}
