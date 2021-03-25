package com.automation.utils;


import com.jayway.jsonpath.JsonPath;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo {
	public static void main(String[] args) {

		String body = "{ \"name\": \"chirag\", \"job\": \"trainer\" }";
//		RestAssured.given().baseUri("https://reqres.in").when().
//		get("/api/users?page=2").then().log().all().statusCode(200);

//		RestAssured.given().baseUri("https://reqres.in").when().
//		get("/api/users/2").then().log().all().statusCode(200);

//		RestAssured.given().baseUri("https://reqres.in").contentType(ContentType.JSON).body(body).when()
//				.post("/api/users").then().log().all().statusCode(201);

		RestAssured.baseURI = "https://reqres.in";

		RequestSpecification reqSpecs = RestAssured.given();
		reqSpecs = reqSpecs.contentType(ContentType.JSON);
		reqSpecs = reqSpecs.body(body);
		Response resp = reqSpecs.post("/api/users");
		String resBody = resp.asString();
		System.out.println(resBody);
		System.out.println(JsonPath.read(resBody, "$.name"));
	}
}
