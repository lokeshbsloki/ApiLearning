package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class BatchProcessing {
	// jdbc driver and url
		public final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		public final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_learning";

		// database credentials
		public final String UN = "root";
		public final String PWD = "lokesh";

		@Test
		public void connectdb() {
			Connection conn = null;
			Statement stat = null;
			try {
				conn = DriverManager.getConnection(DB_URL, UN, PWD);
				stat=conn.createStatement();
				stat.addBatch("INSERT INTO Employee VALUES(106,'Lokesh66','lokeshbs441993@gmail.com','4418958034')");
				stat.addBatch("INSERT INTO Employee VALUES(107,'Lokesh77','lokeshbs551993@gmail.com','5518958034')");
				
				stat.executeBatch();
				//conn.commit();

				
				

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					stat.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

}
