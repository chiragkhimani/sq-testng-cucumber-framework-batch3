package com.automation.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
	
	static WebDriver driver;

	public static void createDriver() {
		System.setProperty("webdriver.chrome.driver", "src//test//resources//webdrivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
