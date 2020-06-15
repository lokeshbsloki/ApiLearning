package com.jsonconversion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ParseJsonToJava {

	
	public static void main(String[] args) throws Exception, JsonProcessingException {
		
		String json="{\"id\":102,\"name\":\"lokesh2\",\"age\":25,\"mobile\":961895803,\"education\":\"bcom\"}";
		ObjectMapper mapper = new ObjectMapper();
		Student student = mapper.readValue(json, Student.class);
		System.out.println(student);
		
	}
}
