package com.pojo;

public class TestClass {

	public static void main(String[] args) {

		Employee empobj= new Employee("lokesh", 101, "lokeshbs@gmail.com");
		ParserClass par=new ParserClass();
//		System.out.println("***********marshelling*********");
//		par.marshellTest(empobj);
		
		System.out.println("************unmarshalleng*************");
		Employee emp2 = par.unmarshellarTest();
		System.out.println(emp2.getEname()+"  "+emp2.getEid()+"  "+emp2.getEmail());
	}

}
