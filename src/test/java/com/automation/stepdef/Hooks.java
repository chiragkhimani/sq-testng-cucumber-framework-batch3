package com.automation.stepdef;

import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class Hooks {

	@Before("@web")
	public void setUp() {
		PropertyReader.initProperty();
		DriverUtils.createDriver();
	}
	
	@Before("@api")
	public void setUpAPI() {
		PropertyReader.initProperty();
		RestAssured.baseURI = PropertyReader.getProperty("api.basuri");
	}

	@After("@web")
	public void cleanUp() {
		DriverUtils.getDriver().quit();
	}

}
