package com.whl.sample.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whl.sample.web.config.ConfigurationConfig;

@RestController
public class SampleController {

	@Autowired
	ConfigurationConfig config;
	
	@GetMapping("/message")
	public String getMessage() {
		return config.getMessage();
	}
}
