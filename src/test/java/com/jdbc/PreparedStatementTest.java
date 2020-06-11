package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class PreparedStatementTest {

	// jdbc driver and url
	public final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	public final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_learning";

	// database credentials
	public final String UN = "root";
	public final String PWD = "lokesh";

	@Test
	public void connectdb() {
		Connection conn = null;
		PreparedStatement stat = null;
		try {
			conn = DriverManager.getConnection(DB_URL, UN, PWD);
			stat = conn.prepareStatement("INSERT INTO Employee VALUES(?,?,?,?)");
			stat.setInt(1, 104);
			stat.setString(2, "Lokesh44");
			stat.setString(3, "lokeshbs44@gmail.com");
			stat.setString(4, "4441114445");

			//System.out.println("column inserted = "+stat.executeUpdate());
			
			stat=conn.prepareStatement("UPDATE Employee set ename=? WHERE empid=?");
			stat.setString(1, "Lokeshbs44update");
			stat.setInt(2, 104);
			//System.out.println("column updated = "+stat.executeUpdate());
			
			stat=conn.prepareStatement("DELETE FROM Employee WHERE empid=?");
			stat.setInt(1, 104);
			System.out.println("column deleted = "+stat.executeUpdate());

			
			

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
