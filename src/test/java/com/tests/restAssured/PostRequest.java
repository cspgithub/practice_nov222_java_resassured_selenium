package com.tests.restAssured;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequest {

	@Test(enabled = false)

	public void postRequest() {

		Response resp = given().contentType(ContentType.JSON).header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
				.body(new File(System.getProperty("user.dir") + "/src/test/resources/jsonBodyrequest/jsonrequest.json"))
				.log().all().post("https://restful-booker.herokuapp.com/booking");

		int actualStatus = resp.getStatusCode();
		assertEquals(actualStatus, 200);
		resp.prettyPrint();
	}

	@Test(enabled = false)

	public void postRequestByconvertingFileToString() throws IOException {

		String reqBody = new String(Files.readAllBytes(
				Paths.get(System.getProperty("user.dir") + "/src/test/resources/jsonBodyrequest/jsonrequest.json")));

		Response resp = given().contentType(ContentType.JSON).header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
				.body(reqBody).log().all().post("https://restful-booker.herokuapp.com/booking");

		int actualStatus = resp.getStatusCode();
		assertEquals(actualStatus, 200);
		resp.prettyPrint();
	}

	@Test(enabled = true)

	public void postRequestByCreatingBodyUsingHashMap() throws IOException {

		Faker faker = new Faker();

		Map<String, Object> book = new LinkedHashMap<>();
		book.put("firstname", faker.name().firstName());
		book.put("lastname", "tet");
		book.put("totalprice", "12");
		book.put("depositpaid", "true");
		Map<String, Object> bookdates = new LinkedHashMap<>();
		bookdates.put("checkin", "2018-01-01");
		bookdates.put("checkout", "2019-01-01");
		book.put("bookingdates", bookdates);
		book.put("additionalneeds", "breakfast");

		Response resp = given().contentType(ContentType.JSON).header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
				.body(book).log().all().post("https://restful-booker.herokuapp.com/booking");

		int actualStatus = resp.getStatusCode();
		assertEquals(actualStatus, 200);
		resp.prettyPrint();
	}

	@Test
	public void postRequestByCreatingBodyUsingJsonObject(){

		JSONObject book = new JSONObject();
		Faker faker = new Faker();
		
		book.put("firstname", faker.name().firstName());
		book.put("lastname", "tet");
		book.put("totalprice", "12");
		book.put("depositpaid", "true");
		JSONObject bookdates = new JSONObject();
		bookdates.put("checkin", "2018-01-01");
		bookdates.put("checkout", "2019-01-01");
		book.put("bookingdates", bookdates);
		book.put("additionalneeds", "breakfast");
		Response resp = given()
				.contentType(ContentType.JSON)
				.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
				.body(book.toMap())
				.log()
				.all()
				.post("https://restful-booker.herokuapp.com/booking");

		int actualStatus = resp.getStatusCode();
		assertEquals(actualStatus, 200);
		resp.prettyPrint();
	}
}
