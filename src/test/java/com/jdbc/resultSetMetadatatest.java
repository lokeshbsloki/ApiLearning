package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class resultSetMetadatatest {

	// jdbc driver and url	
	public final String JDBC_DRIVER="com.mysql.jdbc.Driver";	
	public final String DB_URL="jdbc:mysql://localhost:3306/jdbc_learning";

	//database credentials
	public final String UN="root";
	public final String PWD="lokesh";
	
	@Test
	public void connectdb() {
		Connection conn=null;
		Statement stat=null;
		try {
			//to register the driver
			//	Class.forName(JDBC_DRIVER);
			//create a connection to a db
			//driver manager class acts as a driver btw user and database it keeps the track of the drivers that are available 
			//for establishing connection to the DB
			//getConnection(String url) is used to establish the connection with specified url
			conn = DriverManager.getConnection(DB_URL, UN, PWD);
			 stat = conn.createStatement();
			 ResultSet rs = stat.executeQuery("SELECT * FROM Employee");
			 ResultSetMetaData metadata = rs.getMetaData();

			 System.out.println("no of columns "+metadata.getColumnCount());
			 System.out.println("column name "+metadata.getColumnName(2));
			 System.out.println("column type is "+metadata.getColumnType(2));
			 System.out.println("column type name is"+metadata.getColumnTypeName(2));
			 System.out.println("table name is "+metadata.getTableName(2));
			 
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				stat.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
	
	
	
	
	

