package org.hillel.it.bereginya.model.entity;

import java.util.*;


public class Basket {
	private long id;
	private static long iter = 0;
	private Map<Product, Integer> Items;
	private double TotalAmount;

	public Basket() {
		id = ++iter;
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
	
	protected void changeCountOfProduct(Product pr, int count) {
		Items.put(pr, count);
	}
	
	protected double getTotalAmount() {
		return TotalAmount;
	}
}
