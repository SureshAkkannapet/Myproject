package com.mkyong.bean;

import java.util.Date;



//@Entity
//@Table(name="SURESH_PRACTICE_USER")

public class User {
	//@Column(name="USERNAME")
   private String username;
	//@Column(name="PASSWORD")
   private String password;
	//@Column(name="EMAIL")
   private String email;
	//@Column(name="BIRTHDATE")
   private Date birthDate;
	//@Column(name="PROFESSION")
   private String profession;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Date getBirthDate() {
	return birthDate;
}
public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}
public String getProfession() {
	return profession;
}
public void setProfession(String profession) {
	this.profession = profession;
}

}
