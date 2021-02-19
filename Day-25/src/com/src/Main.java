package com.src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Customer c=(Customer)context.getBean("cset");
		Customer c1=(Customer)context.getBean("csetobj");
		Customer c2=(Customer)context.getBean("cons");
		Customer c3=(Customer)context.getBean("consobj");
		Customer c4=(Customer)context.getBean("conslist");
		Customer c5=(Customer)context.getBean("setlist");
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		

	}

}
