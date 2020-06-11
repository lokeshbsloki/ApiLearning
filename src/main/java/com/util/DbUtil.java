package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DbUtil {

	// jdbc driver and url
	public final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	public final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_learning";

	// database credentials
	public final String UN = "root";
	public final String PWD = "lokesh";

	public Connection conn = null;
	public Statement stat = null;
	public PreparedStatement pstat = null;

	public Connection getConnection(String url, String user, String password) {

		try {
			conn = DriverManager.getConnection(url, user, password);
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
			stat = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int createTable(String query) {

		int res = 0;
		try {
			res = stat.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	public int updateValues(String query) {

		int res = 0;
		try {
			res = stat.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	public int deleteData(String query) {

		int res = 0;
		try {
			res = stat.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	public ResultSet readData(String query) {

		ResultSet res = null;
		try {
			res = stat.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	public int[] createTableusingPS(String query) {

		int[] res = null;
		try {
			pstat.addBatch(query);
			res = pstat.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	public int updateValuesUsingPS(String query, String[] arr) {

		int res = 0;
		try {
			pstat = conn.prepareStatement(query);

			pstat.setInt(1, Integer.parseInt(arr[0]));
			pstat.setString(2, arr[1]);
			pstat.setString(3, arr[2]);
			pstat.setString(4, arr[3]);
			res=pstat.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public int deleteDataUsingPS(String query,int empid) {

		int res = 0;
		try {
			pstat = conn.prepareStatement(query);
			pstat.setInt(1, empid);
			res=pstat.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public ResultSet readDataUsingPS(String query,String tablename) {

		ResultSet res = null;
		try {
			pstat = conn.prepareStatement(query);
			res = pstat.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

}
