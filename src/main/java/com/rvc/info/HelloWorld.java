package com.rvc.info;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class HelloWorld {

	
	@RequestMapping("/hello")
	public String helloWorld() {
		
		return "Hello world !!!!!!!!!!!";
	}
	
}
