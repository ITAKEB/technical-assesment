package org.example.api.user.client.petstore.demo.base;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseApiClient {

    protected RequestSpecification request;

    public BaseApiClient() {
        this.request = RestAssured.given()
                .contentType("application/json")
                .accept("application/json");
//                .log().all(); // logging the request
    }

    protected Response get(String endpoint) {
        return request.when().get(endpoint).then().log().all().extract().response();
    }

    protected Response post(String endpoint, Object body) {
        return request.body(body)
                .when().post(endpoint)
                .then().log().all().extract().response();
    }

    protected Response put(String endpoint, Object body) {
        return request.body(body)
                .when().put(endpoint)
                .then().log().all().extract().response();
    }

    protected Response delete(String endpoint) {
        return request.when().delete(endpoint).then().log().all().extract().response();
    }

}
