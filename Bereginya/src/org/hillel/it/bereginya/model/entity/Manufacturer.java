package org.hillel.it.bereginya.model.entity;

import java.util.HashSet;
import java.util.Set;

public class Manufacturer {
	private int id;
	private String name;
	private Country country;
	private Set<Product> products = new HashSet<Product>();
	private static int iterator=0;;
	
	public Manufacturer(String name, Country country) {	
		this.name = name;
		this.country = country;
		id = ++iterator;
	}
		
	public int          getId()       {	return id;	        }
	public Set<Product> getProducts() { return products; 	}
	public String       getName()     {	return name;	    }
	public Country      getCountry()  {	return country;	    }

	public void setProducts(Set<Product> products)    {	this.products = products; }
	public void editName(String name)                 {	this.name     = name;     }
	public void editCountry(Country country)          {	this.country  = country;  }
}
