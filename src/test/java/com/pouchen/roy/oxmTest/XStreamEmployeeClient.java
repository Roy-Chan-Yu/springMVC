package com.pouchen.roy.oxmTest;

import java.io.File;
import java.io.FileWriter;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.transform.stream.StreamResult;

import com.pouchen.roy.oxm.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.xstream.XStreamMarshaller;

public class XStreamEmployeeClient {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(context.getBean("xstreamMarshallerBean").getClass());
		XStreamMarshaller marshaller = (XStreamMarshaller)context.getBean("xstreamMarshallerBean");
		
		
		XstreamEmployee xstreamEmployee = new XstreamEmployee();
		xstreamEmployee.setId(111);
		xstreamEmployee.setName("Roy");
		xstreamEmployee.setSalary(555555555);
		
		marshaller.marshal(xstreamEmployee,new StreamResult(new FileWriter("Xstream.xml")) );
		System.out.println("XML Created Sucessfully...");
		
	}

}
