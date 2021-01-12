package services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

import business.Bank;

public class LogInException implements ThrowsAdvice {

	public void afterThrowing(Exception e) {
		Log l = LogFactory.getLog(Bank.class);
		l.info("incase of exception in deposite: " + e.getMessage());
	}
}
