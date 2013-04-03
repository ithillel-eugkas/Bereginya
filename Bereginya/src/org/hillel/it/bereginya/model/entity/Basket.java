package org.hillel.it.bereginya.model.entity;

import java.util.*;


public class Basket {
	private long id;
	private static long iteratorID = 0;
	private Map<Product, Integer> Items;
	private double TotalAmount;

	public Basket() {
		id = ++iteratorID;
		TotalAmount = 0.0;
		Items = new HashMap<Product, Integer>();
	}
	
	protected void addProduct(Product pr, int count) {
		Items.put(pr, new Integer(count));
		TotalAmount += (pr.getPrice() * count);
	}
	
	protected void removeProduct(Product pr) {		
		TotalAmount -= (pr.getPrice() * Items.get(pr));
		Items.remove(pr);		
	}
	
	protected void editCount(Product pr, int count) {
		TotalAmount -= (pr.getPrice() * Items.get(pr));
		Items.put(pr, count);
		TotalAmount += (pr.getPrice() * count);
	}
	
	protected double getTotalAmount() {
		return TotalAmount;
	}
}
