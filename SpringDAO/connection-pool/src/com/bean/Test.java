package com.bean;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		BasicDataSource bds = new BasicDataSource();
//		bds.setDriverClassName("org.postgresql.Driver");
//		bds.setUrl("jdbc:postgresql://localhost:5432/sushildb");
//		bds.setUsername("sushil");
//		bds.setPassword("sushil");
//		bds.setMaxTotal(15);
//		bds.setMaxIdle(5);
//		bds.setMaxWaitMillis(5000);
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		DataSource ds = (DataSource) ctx.getBean("bds");
		for(int i=0; i<20000; i++) {
			try {
				Connection con = ds.getConnection();
				System.out.println(con + ": " + i);
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
