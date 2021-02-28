package com.automation.utils;

public class Demo {
	public static void main(String[] args) throws Exception {
		ExcelDataReader.initExcelData();
		for (int i = 0; i < ExcelDataReader.getNumberOfRow(); i++) {
			for (int j = 0; j < ExcelDataReader.getNumberOfCol(); j++) {
				System.out.print(ExcelDataReader.getData(i, j) + "  ");
			}
			System.out.println();
		}
	}
}
