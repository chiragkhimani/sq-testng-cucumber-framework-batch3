package com.automation.utils;

import java.sql.ResultSet;

public class DataBaseUtilsTester {
	public static void main(String[] args) throws Exception {
		PropertyReader.initProperty();
		DataBaseUtils.connectDataBase();

		ResultSet rs = DataBaseUtils.getResultSet("select * from employees;");

		while (rs.next()) {
			System.out.println(rs.getString("first_name"));
		}

		DataBaseUtils.closeDataBaseConnection();
	}
}
