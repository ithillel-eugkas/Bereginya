package org.hillel.it.bereginya.model.entity;

import java.util.Date;

public class Order {
	private Basket basket;
	Date date;
	String shopper;
	
	public Order(Basket bs, Shopper shopper) {
		basket = bs.cloneData();
		bs = null;
		date = new Date();
		this.shopper = shopper.getLOGIN(); 
	}
	
	public void sendOrderToShop() {}
	public void sendNoticeToShopper() {}
	
}
