package com.example.utils;

import org.testng.ISuite;
import org.testng.ISuiteListener;

import com.example.ServerConfig;

import io.restassured.RestAssured;

import org.aeonbits.owner.ConfigFactory;

public class TestListener implements ISuiteListener {
    private static final ServerConfig CONFIG = ConfigFactory.create(ServerConfig.class);

    @Override
    public void onStart(ISuite suite) {
        RestAssured.baseURI = CONFIG.baseUrl();
    }
    
}