package com.example.poc.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

	Logger log = LoggerFactory.getLogger(Api.class);

	@RequestMapping("/hello")
	public String sayHi() {
		return "HI ANIRBAN";
	}
	
	@RequestMapping("/user")
	public String getAllCourse() {
		log.debug("Get aall courses");
		return "I am USER";
	}
	
	@RequestMapping("/admin")
	public String getTopic() {
		return "I am ADMIN";
	}
	
	
}


