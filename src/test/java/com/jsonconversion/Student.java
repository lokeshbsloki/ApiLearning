package com.jsonconversion;

public class Student {

	
	private int id;
	private String name;
	private int age;
	private long mobile;
	private String education;
	
	public Student() {
		
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", mobile=" + mobile + ", education="
				+ education + "]";
	}


	public Student(int id, String name, int age, long mobile, String education) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mobile = mobile;
		this.education = education;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
}
