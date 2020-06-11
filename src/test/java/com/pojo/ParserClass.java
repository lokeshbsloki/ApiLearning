package com.pojo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.*;

public class ParserClass {

	public void marshellTest(Employee emp)  {
		
		try {
			JAXBContext jaxb = JAXBContext.newInstance(com.pojo.Employee.class);
			Marshaller mar = jaxb.createMarshaller();
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			mar.marshal(emp ,System.out);
			mar.marshal(emp,new FileOutputStream("./Employee.xml"));	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Employee unmarshellarTest() {
		
		try {
			Employee emp=null;
			JAXBContext jaxb = JAXBContext.newInstance(com.pojo.Employee.class);
			Unmarshaller unmar = jaxb.createUnmarshaller();
			emp=(Employee)unmar.unmarshal(new File("./Employee.xml"));
			return emp;
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	
	
	
	
}
