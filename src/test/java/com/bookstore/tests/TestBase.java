package com.bookstore.tests;

import static io.restassured.RestAssured.*;

import com.bookstore.utilities.ConfigurationReader;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;

import java.lang.module.Configuration;

public class TestBase {

    public static Response response;

    @BeforeMethod
    public void setUp(){
        baseURI = ConfigurationReader.get("baseURI");

    }

}
