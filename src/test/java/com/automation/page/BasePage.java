package com.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.CommonMethods;

public class BasePage {
	WebDriver driver;
	CommonMethods commonMethods;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		commonMethods = new CommonMethods(driver);
	}
}
