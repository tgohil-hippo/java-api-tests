package com.example.rest;

import java.util.ArrayList;
import com.example.models.BulkPostcodesRequest;
import com.example.models.GetPostcodesResponse;
import com.example.models.PostBulkPostcodesResponse;

import io.restassured.RestAssured;

public class Postcodes {

    public static GetPostcodesResponse getPostcodeData(String baseUrl, String postcode) {
        return RestAssured
                .given()
                .contentType("application/json")        
                .when()
                .urlEncodingEnabled(false)
                .get(baseUrl + "/postcodes/" + postcode)
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(GetPostcodesResponse.class);
    }

    public static PostBulkPostcodesResponse postBulkPostcodes(String baseUrl, String postcode, String secondPostcode) {
        BulkPostcodesRequest request = new BulkPostcodesRequest(){};

        request.postcodes = new ArrayList<String>();

        request.postcodes.add(postcode);
        request.postcodes.add(secondPostcode);
        
        return RestAssured
                .given()
                .contentType("application/json")        
                .when()
                .urlEncodingEnabled(false)
                .body(request)
                .post(baseUrl + "/postcodes")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(PostBulkPostcodesResponse.class);
    }
    
}
