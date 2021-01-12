package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext confCtx = new ClassPathXmlApplicationContext("spring.xml"); //refresh event
		confCtx.stop();		//stop event
		confCtx.start();	//start event
		confCtx.refresh();	//refresh event
		confCtx.close();	//IOC container close event
		confCtx.refresh();	//refresh event
	}

}
