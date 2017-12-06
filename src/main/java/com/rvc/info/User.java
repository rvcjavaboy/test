package com.rvc.info;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonPropertyOrder({"xid","name","email","password","cpassword"})
public class User {
@JsonIgnore	
private int id;
private String name,email,password,cpassword;
public User() {}
@JsonProperty(value="xid")
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public User(int id, String name, String email, String password, String cpassword) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.password = password;
	this.cpassword = cpassword;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCpassword() {
	return cpassword;
}
public void setCpassword(String cpassword) {
	this.cpassword = cpassword;
}

}
