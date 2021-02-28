package com.automation.utils;

import java.io.FileReader;
import java.util.Properties;

public class PropertyReader {

	static Properties prop = new Properties();

	public static void initProperty() {
		try {
			FileReader reader = new FileReader("src//test//resources//config//config.properties");
			prop.load(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
