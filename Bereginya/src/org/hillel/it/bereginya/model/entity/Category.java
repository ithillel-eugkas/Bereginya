package org.hillel.it.bereginya.model.entity;

import java.util.HashSet;
import java.util.Set;

public class Category {
	private int id;
	private String name;
	private Set<Integer> products = new HashSet<Integer>();
	
	public Category(int id, String name) {		
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Integer> getProducts() {
		return products;
	}

	public void setProducts(Set<Integer> products) {
		this.products = products;
	}
	
}
