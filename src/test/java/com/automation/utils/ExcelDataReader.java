package com.automation.utils;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	

	public static void initExcelData() {
		try {
			InputStream input = new FileInputStream("src//test//resources//data//TestData.xlsx");
			workbook = new XSSFWorkbook(input);
			sheet = workbook.getSheetAt(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getData(int rowNumber, int columnNumber) {
		XSSFRow row = sheet.getRow(rowNumber);
		return row.getCell(columnNumber).getStringCellValue();
	}

	public static int getNumberOfRow() {
		return sheet.getPhysicalNumberOfRows();
	}

	public static int getNumberOfCol() {
		return sheet.getRow(0).getPhysicalNumberOfCells();
	}

}
