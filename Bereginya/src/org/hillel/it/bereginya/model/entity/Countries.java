package org.hillel.it.bereginya.model.entity;

import java.util.HashSet;
import java.util.*;

public class Countries {
	private int idCountry;
	private String name;
	Set<Manufacturer> products = new HashSet<Manufacturer>();
	
	
	public Countries(int idCountry, String name) {
		super();
		this.idCountry = idCountry;
		this.name = name;
	}


	public int getIdCountry() {
		return idCountry;
	}


	public void setIdCountry(int idCountry) {
		this.idCountry = idCountry;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Set<Manufacturer> getProducts() {
		return products;
	}


	public void setProducts(Set<Manufacturer> products) {
		this.products = products;
	}
}
