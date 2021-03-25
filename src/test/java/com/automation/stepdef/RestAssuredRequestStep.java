package com.automation.stepdef;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.automation.utils.PropertyReader;
import com.automation.utils.RestAssuredUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RestAssuredRequestStep {

	@Given("user set up request for create booking api")
	@Given("user set up request for get booking list api")
	public void user_set_up_request_for_get_booking_api() {
		RestAssuredUtils.setEndPoint(PropertyReader.getProperty("get.booking.list"));
	}

	@When("set request body for create booking api")
	public void setRequestBodyCreateBookingAPI() throws IOException {
		String body = new String(Files.readAllBytes(Paths.get("src//test//resources//data//CreateBookingRequest.txt")));
		RestAssuredUtils.setBody(body);
	}

	@Given("set header {string} value {string}")
	public void set_header_value(String headerName, String headerValue) {
		RestAssuredUtils.setHeader(headerName, headerValue);
	}

	@When("user perform post the request")
	public void user_post_the_request() {
		RestAssuredUtils.post();
	}

	@When("user perform get the request")
	public void user_get_the_request() {
		RestAssuredUtils.get();
	}

}
