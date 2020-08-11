package com.luv2code.springboot.cruddemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	
	
	
	@GetMapping("/employees")
	public String getDemo() {
		
		return "Welcome To Spring_Boot_Rest_CURD_Using_DATA_REST Project";
	}
	
	
		
}










