package client;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import services.LogBeforeAndAfterService;

public class Client {

	public static void main(String[] args) {
		//create target
		Bank b = new Bank();
		//create advice
		LogBeforeAndAfterService lbs = new LogBeforeAndAfterService();
		//add target+advice to proxy
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(b);
		pfb.addAdvice(lbs);
		
		//get Generated proxy object
		Bank bproxy = (Bank) pfb.getObject();
		System.out.println(bproxy.deposite("sbi123", 5000));
		
	}

}
