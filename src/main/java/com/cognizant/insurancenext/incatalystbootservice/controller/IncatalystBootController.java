package com.cognizant.insurancenext.incatalystbootservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class IncatalystBootController {	
	
	@Value("${db.username}")
	private String dbUserName;
	
	@RequestMapping("/hello")	
	public String welcome(){
		return "Welcome "+ dbUserName + " By Spring Boot Controller";
	}    
}
