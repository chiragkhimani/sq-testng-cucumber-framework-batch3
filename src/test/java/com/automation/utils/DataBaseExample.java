package com.automation.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseExample {
	public static void main(String[] args) throws Exception {

		// 1. Connect

			// 1.1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			// 1.2 Connect to the database
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://sprintqa.cr55bzudcbob.us-east-2.rds.amazonaws.com:3306/mycompany", "admin",
					"BK57OdWIz2mp2nwpTfkI");

		// 2. Query

			// 2.1 Create Statement
			Statement stmt = con.createStatement();
	
			// 2.2 Execute Query
			ResultSet rs = stmt.executeQuery("select * from employees;");
	
		// 3. Process Result
			while (rs.next()) {
				System.out.print(rs.getString("first_name")+" ");
				System.out.print(rs.getString("salary"));
				System.out.println();
			}
			
		// 4. Close Connection
			rs.close();
			stmt.close();
			con.close();

	}
}
