package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {

	// jdbc driver and url	
	public final String JDBC_DRIVER="com.mysql.jdbc.Driver";	
	public final String DB_URL="jdbc:mysql://localhost:3306/jdbc_learning";

	//database credentials
	public final String UN="root";
	public final String PWD="lokesh";
	
	public Connection conn=null;
	public Statement stat=null;
	
	public Connection getConnection(String url,String user,String password) {
		
		try {
			conn= DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void closeConnection(Connection conn) {
		
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void setStatement(Connection conn) {
		
		try {
			stat=conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int createTable(String query) {
		
		int res=0;
		try {
			res = stat.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public int updateValues(String query) {
		
		int res=0;
		try {
			res = stat.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	public int deleteData (String query) {
		
		int res=0;
		try {
			res = stat.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public ResultSet readData(String query) {
		
		 
		ResultSet res=null;
		try {
			res = stat.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
}
