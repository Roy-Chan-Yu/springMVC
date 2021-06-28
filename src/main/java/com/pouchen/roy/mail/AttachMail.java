package com.pouchen.roy.mail;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.nio.charset.CharsetEncoder;

import javax.mail.internet.MimeMessage;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;



public class AttachMail {
	
	private JavaMailSender mailSender;
	
	public AttachMail() {
		
	}
	
	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendMail(String from, String to, String subject, String msg) {
		try {
			MimeMessage message = mailSender.createMimeMessage();
			
			MimeMessageHelper helper = new MimeMessageHelper(message,true);
			helper.setFrom(from);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(msg);
			
			// attach the static file
			FileSystemResource file = new FileSystemResource(new File("C:/Users/Roy.Chan/Pictures/Saved Pictures/pexels-tomas.jpg"));
			helper.addAttachment("gengar.png", file);
			
			mailSender.send(message);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
