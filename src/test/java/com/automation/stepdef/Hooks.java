package com.automation.stepdef;

import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUp() {
		PropertyReader.initProperty();
		DriverUtils.createDriver();
	}

	@After
	public void cleanUp() {
		DriverUtils.getDriver().quit();
	}

}
