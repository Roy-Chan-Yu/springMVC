package com.pouchen.roy.httpInvoker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientInvoker {

	public static int getCube(int num) {
		ApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml");
		Calculation calculation = (Calculation)context.getBean("calculationBean");
		return calculation.cube(num);
	}
	
	public static void main(String[] args) {
		ClientInvoker a = new ClientInvoker();
		
		System.out.println(a.getCube(3));
	}
}
