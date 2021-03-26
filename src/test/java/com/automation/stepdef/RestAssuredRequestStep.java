package com.automation.stepdef;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.automation.utils.PropertyReader;
import com.automation.utils.RestAssuredUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class RestAssuredRequestStep {

	@Given("user set up request for booking api")
	public void user_set_up_request_for_get_booking_api() {
		RestAssuredUtils.setEndPoint(PropertyReader.getProperty("get.booking.list"));
	}
	
	@Given("user set up request for ping api")
	public void user_set_up_request_for_get_ping_api() {
		RestAssuredUtils.setEndPoint(PropertyReader.getProperty("ping.api"));
	}

	@Given("user set up request for update booking api")
	public void user_set_up_request_for_update_get_booking_api() {
		String updateBookingEndPoint = String.format(PropertyReader.getProperty("update.boooking.api"), 1);
		RestAssuredUtils.setEndPoint(updateBookingEndPoint);
	}

	@Given("user set up request for auth api")
	public void user_set_auth_api_request() {
		RestAssuredUtils.setEndPoint(PropertyReader.getProperty("auth.api"));
	}
	
	@Given("user set up request for single user get reqres api")
	public void user_set_single_user_get_reqres_api() {
		RestAssured.baseURI = PropertyReader.getProperty("api.reqrest.basuri");
		RestAssuredUtils.setEndPoint(PropertyReader.getProperty("reqres.single.user"));
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

	@Given("set request body for auth api")
	public void set_request_body_for_auth_api() throws IOException {
		String body = new String(Files.readAllBytes(Paths.get("src//test//resources//data//AuthAPIRequest.txt")));
		RestAssuredUtils.setBody(body);
	}

	@Given("set token value for update booking api")
	public void set_token_value_for_update_booking_api() {
		RestAssuredUtils.setHeader("Cookie", "token=" + RestAssuredResponseStep.responseData.get("token"));
	}
	
	@When("user perform put the request")
	public void user_perform_put_request() {
		RestAssuredUtils.put();
	}

}
