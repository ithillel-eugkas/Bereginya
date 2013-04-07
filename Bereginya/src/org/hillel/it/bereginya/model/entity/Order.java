package org.hillel.it.bereginya.model.entity;

import java.util.Date;

public class Order {
	private Basket basket;
	private Date date;
	private Shopper shopper;
	
	public Order(Basket bs, Shopper shopper) {
		basket = bs.cloneData();
		bs = null;
		date = new Date();
		this.shopper = shopper; 
	}
	
	public Date getDate() {
		return date;
	}
	
	public Shopper getShopper() {
		return shopper;
	}
	
	public void sendOrderToShop() {}
	public void sendNoticeToShopper() {}
	
}
