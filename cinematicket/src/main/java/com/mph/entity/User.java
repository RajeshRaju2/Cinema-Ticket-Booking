package com.mph.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
private int userId;
	@Column
private String fname;
	@Column
private String lname;
	@Column
private String gender;
	@Column
private String email;
	@Column
private String password;
	@Column
private int phone;
	


public User() {
	super();
	// TODO Auto-generated constructor stub
}


public User(int userId, String fname, String lname, String gender, String email, String password, int phone,
		Ticket ticket) {
	super();
	this.userId = userId;
	this.fname = fname;
	this.lname = lname;
	this.gender = gender;
	this.email = email;
	this.password = password;
	this.phone = phone;
	
}


public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

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

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
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

public int getPhone() {
	return phone;
}

public void setPhone(int phone) {
	this.phone = phone;
}

@Override
public String toString() {
	return "User [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", email="
			+ email + ", password=" + password + ", phone=" + phone + "]";
}





}
