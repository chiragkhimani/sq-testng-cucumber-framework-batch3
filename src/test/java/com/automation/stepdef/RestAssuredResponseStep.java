package com.automation.stepdef;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import com.automation.utils.RestAssuredUtils;

import io.cucumber.java.en.Then;

public class RestAssuredResponseStep {

	static Map<String, String> responseData = new HashMap<String, String>();

	@Then("verify response code is {int}")
	public void verify_response_code_is(Integer code) {
		Assert.assertTrue("Expected response code " + code + " : Actual code is " + RestAssuredUtils.getStatusCode(),
				RestAssuredUtils.getStatusCode() == code);
	}

	@Then("save token value from response")
	public void saveTokenValue() {
		String token = RestAssuredUtils.getResponseData("$.token");
		responseData.put("token", token);
	}

}
