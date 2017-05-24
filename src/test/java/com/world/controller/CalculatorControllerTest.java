package com.world.controller;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.world.Application;


@RunWith (SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration (classes=Application.class)
@WebAppConfiguration
@IntegrationTest
public class CalculatorControllerTest {

    @Test
    public void testAddition () {
    	System.setProperty("environment", "test");
        RestTemplate rest  = new TestRestTemplate ();
        ResponseEntity<String> response = rest.getForEntity ("http://localhost:5000/addTwoNumbers?num1=4&num2=4", String.class);
        Assert.assertNotNull (response);
        Assert.assertEquals (response.getStatusCode(), HttpStatus.OK);
        JsonObject indexResponse = new JsonParser ().parse (response.getBody ()).getAsJsonObject ();
        Assert.assertEquals (indexResponse.get("output").getAsString(), "8");
    }
    
    @Test
    public void testSubraction () {
    	System.setProperty("environment", "test");
        RestTemplate rest  = new TestRestTemplate ();
        ResponseEntity<String> response = rest.getForEntity ("http://localhost:5000/subractTwoNumbers?num1=4&num2=4", String.class);
        Assert.assertNotNull (response);
        Assert.assertEquals (response.getStatusCode(), HttpStatus.OK);
        JsonObject indexResponse = new JsonParser ().parse (response.getBody ()).getAsJsonObject ();
        Assert.assertEquals (indexResponse.get("output").getAsString(), "0");
    }
}
