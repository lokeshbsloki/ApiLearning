package com.jsonconversion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ParseJavaToJson {

	public static void main(String[] args) throws JsonProcessingException {
		
	
	Student st=new Student(101, "lokesh", 27, 861895803, "be");
	
	ObjectMapper mapper=new ObjectMapper();
	String res = mapper.writeValueAsString(st);
	System.out.println(res);
	}
	
}
