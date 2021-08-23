package com.mph.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int userId;
	@Column
private String firstName;
	@Column
private String lastName;
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


public User(int userId, String firstName, String lastName, String gender, String email, String password, int phone,
		Ticket ticket) {
	super();
	this.userId = userId;
	this.firstName= firstName;
	this.lastName = lastName;
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

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName= firstName;
}

public String getlastName() {
	return lastName;
}

public void setlastName(String lastName) {
	this.lastName = lastName;
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
	return "User [userId=" + userId + ", firstlastName=" + firstName+ ", lastName=" + lastName + ", gender=" + gender + ", email="
			+ email + ", password=" + password + ", phone=" + phone + "]";
	}
}
