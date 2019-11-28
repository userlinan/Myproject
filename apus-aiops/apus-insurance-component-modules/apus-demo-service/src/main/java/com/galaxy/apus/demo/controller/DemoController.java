package com.galaxy.apus.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController { 
	@Autowired
	RestTemplate restTemplate;
	public String hiService(String name) {
		//private static final String REST_URL_PREFIX="http://localhost:8001";
		return restTemplate.getForObject("http://localho:8082"+"hi?name="+name,String.class);
    }
}
