package com.tests.restAssured;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Getrequest {

	@Test

	public void getBooks() {
		
		
		Response resp = given().get("https://restful-booker.herokuapp.com/booking");
		
		int actualStatusCode = resp.getStatusCode();
		Assert.assertEquals(actualStatusCode, 200);
		System.out.println(resp.headers());
		
		

	}

}
