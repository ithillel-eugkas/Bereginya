package org.hillel.it.bereginya.model.entity;

import java.util.Date;

public class Admin extends User{
	private final Role role = Role.ADMIN;
	
	public Admin(String lOGIN, String password, String name, Sex sex,
			Date birthday, String email) {
		
		super(lOGIN, password, name, sex, birthday, email);		
	}
	
	public int getRole() {
		return role.getAccess();
	}

}
