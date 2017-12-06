package com.rvc.info.student;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonPropertyOrder({"user_id","fname","lname","email","passsword"})
public class Student {

private Integer id;
private String name,fname,email,password;

public Student() {
	
}

public Student(Integer id, String name, String fname, String email, String password) {
	
	this.id = id;
	this.name = name;
	this.fname = fname;
	this.email = email;
	this.password = password;
}
@JsonIgnore
@JsonProperty(value="user_id")
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
@JsonProperty(value="lname")
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@JsonProperty(value="fname")
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
@JsonProperty(value="email")
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@JsonProperty(value="password")
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
