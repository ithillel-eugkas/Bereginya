package org.hillel.it.bereginya.model.entity;

import java.util.HashSet;
import java.util.Set;

public class Manufacturer {
	private final int id;
	private String name;
	private Country country;
	private Set<Product> products = new HashSet<Product>();
	private static int iteratorID=0;
	
	public Manufacturer(String name, Country country) {	
		this.name = name;
		this.country = country;
		id = ++iteratorID;
	}
		
	public int          getId()       {	return id;	        }
	public Set<Product> getProducts() { return products; 	}
	public String       getName()     {	return name;	    }
	public Country      getCountry()  {	return country;	    }

	public void editName(String name)                 {	this.name     = name;     }
	public void editCountry(Country country)          {	this.country  = country;  }	
	public void addProduct(Product pr)                {	products.add(pr);         }
	public void removeProduct(Product pr)             {	products.remove(pr);      }
}
