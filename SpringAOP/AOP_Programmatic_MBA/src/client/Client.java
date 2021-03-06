package client;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import services.LogBeforeService;

public class Client {

	public static void main(String[] args) {
		//create target
		Bank b = new Bank();
		//create advice
		LogBeforeService lbs = new LogBeforeService();
		//add target+advice to proxy
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(b);
		pfb.addAdvice(lbs);
		
		//get Generated proxy object
		Bank bproxy = (Bank) pfb.getObject();
		System.out.println(bproxy.deposite("sbi123", 5000));
		
	}

}
