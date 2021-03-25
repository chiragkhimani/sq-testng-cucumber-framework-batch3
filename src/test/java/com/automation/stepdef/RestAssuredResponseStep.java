package com.automation.stepdef;

import org.junit.Assert;

import com.automation.utils.RestAssuredUtils;

import io.cucumber.java.en.Then;

public class RestAssuredResponseStep {

	@Then("verify response code is {int}")
	public void verify_response_code_is(Integer code) {
		Assert.assertTrue("Expected response code " + code + " : Actual code is " + RestAssuredUtils.getStatusCode(),
				RestAssuredUtils.getStatusCode() == code);
	}

}
