package com.automation.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseUtils {

	static Statement stmt;
	static Connection con;

	public static void connectDataBase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					PropertyReader.getProperty("connection.url"),
					PropertyReader.getProperty("db.username"), 
					PropertyReader.getProperty("db.password"));
			stmt = con.createStatement();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ResultSet getResultSet(String query) throws SQLException {
		return stmt.executeQuery(query);
	}

	public static void closeDataBaseConnection() throws Exception {
		stmt.close();
		con.close();
	}

}
