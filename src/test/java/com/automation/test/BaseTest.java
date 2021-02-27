package com.automation.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	 WebDriver driver;

	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src//test//resources//webdrivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterSuite
	public void cleanUp() {
		driver.quit();
	}

}
