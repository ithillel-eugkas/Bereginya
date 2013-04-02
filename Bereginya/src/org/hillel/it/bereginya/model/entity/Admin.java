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
	
	public void addCategory(String name) {};
	public void addManufacturer(String name, Country country) {}
	public void addProduct() {}
	public void removeProduct() {}
	public void addUser() {}
	public void deleteUser() {}
	public void viewAllProducts() {}
	public void editProduct() {}
	public void editCategory() {}
}
