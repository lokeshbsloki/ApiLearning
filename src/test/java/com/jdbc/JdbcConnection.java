package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JdbcConnection {

// jdbc driver and url	
public final String JDBC_DRIVER="com.mysql.jdbc.Driver";	
public final String DB_URL="jdbc:mysql://localhost:3306/jdbc_learning";

//database credentials
public final String UN="root";
public final String PWD="lokesh";

@Test
public void connectdb() {
	Connection conn=null;
	Statement stat;
	try {
		//to register the driver
		//	Class.forName(JDBC_DRIVER);
		//create a connection to a db
		conn = DriverManager.getConnection(DB_URL, UN, PWD);
		 stat = conn.createStatement();
		 //create a table in db
		 String createtable="CREATE TABLE Employee"+"(empid INTEGER NOT NULL,"+"	ename VARCHAR(25),"+"email VARCHAR(50),"+"mobile VARCHAR(10),"
		 +"PRIMARY KEY(empid))";
		 //stat.executeUpdate(createtable);
		 
		 String insertvalue1="INSERT INTO Employee "+"VALUES(101,'Lokesh','lokeshbs1993@gmail.com','8618958034')";
		 //stat.executeUpdate(insertvalue1);
		 
		 String insertvalue2="INSERT INTO Employee "+"VALUES(102,'Anusha','anusham1993@gmail.com','9618958035')";
		 //stat.executeUpdate(insertvalue2);
		 
		 String retrivedata="SELECT * FROM Employee";
		 ResultSet res = stat.executeQuery(retrivedata);
		 while(res.next()) {
			 
			 System.out.println(res.getInt("empid")+" "+res.getString("ename")+" "+res.getString("email")+" "+res.getString("mobile"));
		 }
		 
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
