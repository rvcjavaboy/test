package com.rvc.info;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JSONDemo {
	@RequestMapping("/user")
	public User getUser() {
		User u=new User(1,"Ranjit","rvcinfo9600@gmail.com","Ranjit@9600","Ranjit@9600");
		return u;
		
	}
}
