package org.hillel.it.bereginya.model.entity;

import java.util.Date;

public class Shopper extends User{
	private final Role role = Role.SHOPPER;
	private Order orders;
	
	public Shopper(String lOGIN, String password, String name, Sex sex,
			Date birthday, String email) {
		
		super(lOGIN, password, name, sex, birthday, email);		
	}
	
	public Shopper(String lOGIN, String password, String name, Sex sex,
			Date birthday, String email, String phone) {
		
		super(lOGIN, password, name, sex, birthday, email, phone);		
	}
	
	public int getRole() {
		return role.getAccess();
	}
	
	public void makeOrder() {}	
	public void changeProductCount() {}
	public void viewSelectedProducts() {}
}
