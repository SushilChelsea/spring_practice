package client;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import services.LogInException;

public class Client {

	public static void main(String[] args) {
		//create target
		Bank b = new Bank();
		//create advice
		LogInException lie = new LogInException();
		//add target+advice to proxy
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(b);
		pfb.addAdvice(lie);
		
		//get Generated proxy object
		Bank bproxy = (Bank) pfb.getObject();
		System.out.println(bproxy.deposite("sbi124", 5000));
		
	}

}
