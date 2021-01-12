package client;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDao;
import dao.StudentDaoHibImpl;
import model.Student;

public class ClientHibernateTemplate {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("hibernate-template.xml");
		StudentDao studentDao = (StudentDaoHibImpl) ctx.getBean("dao");
		List<Student> students = studentDao.findAllUsingHQL();	
		students.forEach(System.out::println);
		System.out.println("==============================================================================");
		System.out.println(studentDao.findById(3));
		System.out.println("==============================================================================");
		List<Student> students1 = studentDao.findAllUsingCriteria();	
		students1.forEach(System.out::println);
	}

}
