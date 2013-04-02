package org.hillel.it.bereginya.model.entity;

import java.util.Date;

public class Shopper extends User{
	private final Role role = Role.SHOPPER;
	
	public Shopper(String lOGIN, String password, String name, Sex sex,
			Date birthday, String email) {
		
		super(lOGIN, password, name, sex, birthday, email);		
	}
	
	public int getRole() {
		return role.getAccess();
	}
	
	public void addProductToBasket() {}
	public void removeProductFromBasket() {}
	public void changeProductCount() {}
	public void viewSelectedProducts() {}
}
