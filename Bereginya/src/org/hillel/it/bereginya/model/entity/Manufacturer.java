package org.hillel.it.bereginya.model.entity;

import java.util.HashSet;
import java.util.Set;

public class Manufacturer {
	private  int id;
	private String name;
	private String country;
	private Set<Integer> products = new HashSet<Integer>();
	
	public Manufacturer(String name, String country) {	
		this.name = name;
		this.country = country;
	}
		
	public int getId()                {	return id;	        }
	public Set<Integer> getProducts() { return products; 	}
	public String getName()           {	return name;	    }
	public String getCountry()        {	return country;	    }

	public void setId(int id)                         { this.id       = id;	      }
	public void setProducts(Set<Integer> products)    {	this.products = products; }
	public void editName(String name)                 {	this.name     = name;     }
	public void editCountry(String country)           {	this.country  = country;  }
}
