package com.springapps.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springcore/list/config.xml");
	Hospital hospital= (Hospital) context.getBean("hospital");
	System.out.println(hospital);
	
	}

}
