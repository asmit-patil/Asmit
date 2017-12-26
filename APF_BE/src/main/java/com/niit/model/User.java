package com.niit.model;

import java.io.Serializable;

import javax.persistence.*;

import org.springframework.stereotype.Component;
@Component
@Entity
public class User implements Serializable {
@Id
private String email;
private String fname;
private String lname;
private String uname;

private String password;
private String role;
private String addrees;
private int phone;
private boolean enabled;

public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
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
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getAddrees() {
	return addrees;
}
public void setAddrees(String addrees) {
	this.addrees = addrees;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public boolean isEnabled() {
	return enabled;
}
public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}


	
}
