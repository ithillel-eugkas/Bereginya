package org.hillel.it.bereginya.model.entity;

import java.util.Date;

public class Shopper extends User{
	private final Role role = Role.SHOPPER;
	private Basket basket;
	
	public Shopper(String lOGIN, String password, String name, Sex sex,
			Date birthday, String email) {
		
		super(lOGIN, password, name, sex, birthday, email);		
	}
	
	public int getRole() {
		return role.getAccess();
	}
	
	public void addProductToBasket(Product pr) {
		if(basket==null) basket = new Basket();
		basket.addProduct(pr, 1);		
	}
	public void removeProductFromBasket(Product pr) {
		basket.removeProduct(pr);
	}
	
	public void changeProductCount() {}
	public void viewSelectedProducts() {}
}
