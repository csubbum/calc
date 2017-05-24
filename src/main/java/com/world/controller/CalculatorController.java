package com.world.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorController {
	
    @RequestMapping (value = "/addTwoNumbers",
                     method = RequestMethod.GET)
    public String addTwoNumbers (@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
    	String environment = System.getProperty("environment");
    	System.out.println(environment);
    	return "{\"output\":\"" + String.valueOf(Integer.valueOf(num1) + Integer.valueOf(num2)) + "\",\"message\":\"Running in " + environment + "\"}";
    }
    
	@RequestMapping(value = "/subractTwoNumbers", method = RequestMethod.GET)
	public String subractTwoNumbers(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
    	String environment = System.getProperty("environment");
		return "{\"output\":\"" + String.valueOf(Integer.valueOf(num1) - Integer.valueOf(num2)) + "\",\"message\":\"Running in " + environment + "\"}";
	}
}
