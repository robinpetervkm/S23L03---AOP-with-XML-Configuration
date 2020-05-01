package com.norha.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("bean.xml");
		App ap = context.getBean("app",App.class);
		ap.later();
		context.close();
	}
	
	public void later() {
		System.out.println("This message should get printed later");
	}

}
