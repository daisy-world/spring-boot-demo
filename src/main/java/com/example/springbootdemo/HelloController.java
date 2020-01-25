package com.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	
	public String showMessage() {
		System.out.println("inside hello controller......");
		
		return "Hello Springboot";
		
	}
	
	

}
