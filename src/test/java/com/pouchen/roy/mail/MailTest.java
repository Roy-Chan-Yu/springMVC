package com.pouchen.roy.mail;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MailTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Mail mail = (Mail)context.getBean("Mail");
		String sender = "w983874@gmail.com";
		String receiver = "w983874@gmail.com";
		mail.sendMail(sender, receiver, "Hi Royu", "Testing Mail Module...");
		
		List<String> mails = new ArrayList<String>() {
			{
				add("w983874@gmail.com");
				add("w519204830@gmail.com");
				add("invoice@cht.com.tw");
			}
		};
		
		// List to String[] cast
		String[] receivers = mails.stream().toArray(String[]::new);
		
//		String[] receivers = (String[]) mails.toArray();
		mail.sendMail(sender, receivers, "Group Sending", "Testing...");
		
		System.out.println("success for sending the mail...");
		
		System.out.println("----------------------------");
		
		receiver = "w519204830@gmail.com";
		
		AttachMail attachMail = (AttachMail)context.getBean("AttachMail");
		attachMail.sendMail(sender, receiver, "AttachObject", "AttachObjectTestImpl");
		
		System.out.println("success for sending attachment...");
	}

}
