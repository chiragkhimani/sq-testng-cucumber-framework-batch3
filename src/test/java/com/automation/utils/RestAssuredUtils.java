package com.automation.utils;

import com.jayway.jsonpath.JsonPath;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredUtils {
	static RequestSpecification reqSpecs = RestAssured.given();
	static Response response;
	static String endPoint;

	public static void setEndPoint(String endPoint) {
		RestAssuredUtils.endPoint = endPoint;
	}

	public static void setBody(String body) {
		reqSpecs = reqSpecs.body(body);
	}

	public static void setHeader(String name, String value) {
		reqSpecs = reqSpecs.header(name, value);
	}

	public static void get() {
		response = reqSpecs.log().all().get(endPoint);
	}

	public static void post() {
		response = reqSpecs.log().all().post(endPoint);
	}

	public static void put() {
		response = reqSpecs.log().all().put(endPoint);
	}

	public static int getStatusCode() {
		System.out.println(response.asString());
		return response.getStatusCode();
	}

	public static String getResponseData(String jsonPath) {
		return JsonPath.read(response.asString(), jsonPath);
	}

}
