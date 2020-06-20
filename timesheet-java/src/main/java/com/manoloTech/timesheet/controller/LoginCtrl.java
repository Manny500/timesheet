package com.manoloTech.timesheet.controller;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@EnableEurekaClient
@Controller
public class LoginCtrl {
	
	private final static String POST_FACEUSER_URL = "/login";

	@PostMapping(POST_FACEUSER_URL)
	public void authenticateFaceuser() {
	}
}

