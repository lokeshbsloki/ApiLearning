package com.pojo;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Employee")
public class Employee {

	public Employee() {

	}

	private String ename;
	private int eid;
	private String email;

	public Employee(String ename, int eid, String email) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.email = email;

	}

	@XmlElement
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@XmlAttribute
	public int getEid() {
		return eid;
	}

	
	public void setEid(int eid) {
		this.eid = eid;
	}

	@XmlElement
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
