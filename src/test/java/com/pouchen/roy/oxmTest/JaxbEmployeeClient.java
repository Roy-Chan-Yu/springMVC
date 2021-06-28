package com.pouchen.roy.oxmTest;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.stream.StreamResult;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.pouchen.roy.oxm.JaxbEmployee;

public class JaxbEmployeeClient {

	public static void main(String[] args) throws  IOException, JAXBException {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Jaxb2Marshaller marshaller = (Jaxb2Marshaller) context.getBean("jaxbMarshallerBean");
		System.out.println(marshaller.getClass());
		
		JaxbEmployee jaxbEmployee = new JaxbEmployee();
		jaxbEmployee.setId(111);
		jaxbEmployee.setName("Roy");
		jaxbEmployee.setSalary(100000);
		
		marshaller.marshal(jaxbEmployee, new StreamResult(new FileWriter("jaxbEmployee.xml")));
		System.out.println("Xml built Successfully...");
		
	}

}
