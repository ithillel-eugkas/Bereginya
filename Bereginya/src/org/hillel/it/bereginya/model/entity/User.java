package org.hillel.it.bereginya.model.entity;

import java.util.Date;


public class User {
	enum Sex {MALE, FEMALE};	
	private final String NAME;
	private String password;
	private Sex sex;
	private Date birthday;
	private String email;
	
	public User(String name, String password, Sex sex, Date birthday,
			String email) {		
		this.NAME = name;
		this.password = password;
		this.sex = sex;
		this.birthday = birthday;
		this.email = email;
	}
		
	public User(String name, String password, Sex sex, String email) {
		this.NAME = name;
		this.password = password;
		this.sex = sex;
		this.email = email;
	}

	public String getName() {
		return NAME;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
}
