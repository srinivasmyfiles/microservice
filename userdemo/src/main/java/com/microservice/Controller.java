package com.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/api/user")
public class Controller {
	@Autowired
	private Environment env;
	
	@PostMapping("/req")
	public String   name() {
		return " user working";
	}
	
	
	
	@GetMapping("/status/check")
	public String status()
	{
		return "Working on port :" + env.getProperty("local.server.port");
	}

}
