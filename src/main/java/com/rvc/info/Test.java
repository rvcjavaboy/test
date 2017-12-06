package com.rvc.info;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Test {
	
	@RequestMapping("/tests")
	public String demo() {
		
		return "Test";
	}
	
}
