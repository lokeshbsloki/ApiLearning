package com.jdbc;

import java.sql.Connection;

import org.testng.annotations.Test;

import com.util.DbUtil;

public class MinetestClass {

	// jdbc driver and url	
	public final String JDBC_DRIVER="com.mysql.jdbc.Driver";	
	public final String DB_URL="jdbc:mysql://localhost:3306/jdbc_learning";

	//database credentials
	public final String UN="root";
	public final String PWD="lokesh";
	@Test
	public void testingMethods() {
		
		DbUtil db=new DbUtil();
		Connection conn = db.getConnection(DB_URL, UN, PWD);
		 db.setStatement(conn);
		 String createtable="CREATE TABLE Lokesh1"+"(empid INTEGER NOT NULL,"+"	ename VARCHAR(25),"+"email VARCHAR(50),"+"mobile VARCHAR(10),"
				 +"PRIMARY KEY(empid))";
		 db.createTable(createtable);
		 db.closeConnection(conn);
	}
	
	
	
	
}
