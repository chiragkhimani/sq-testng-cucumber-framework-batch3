package com.automation.utils;

import com.jayway.jsonpath.JsonPath;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DataBaseUtilsTester {
	public static void main(String[] args) throws Exception {
		Response res = RestAssured.given().
        when().get("https://reqres.in/api/users?page=2").
        then().extract().response();
		System.out.println(res.asString());
		String str = JsonPath.read(res.asString(),"$.data[0].id").toString();
		System.out.println(str);
	}
}
