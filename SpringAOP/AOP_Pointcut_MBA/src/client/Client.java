package client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Bank;

public class Client {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Bank bproxy = (Bank) ctx.getBean("bproxy");
		
		System.out.println(bproxy.deposite("sbi123", 5000));
		//System.out.println(bproxy.findBal("sbi123"));
		ctx.close();
	}

}
