package org.hillel.it.bereginya.model.entity;

import java.util.*;


public class Category {
	private int id;
	private String name;
	private Set<Product> products = new HashSet<Product>();
	private static int iter = 0;
	
	public Category(String name) {		
		id = ++iter;
		this.name = name;
	}

	public int            getId()          { return id;	       }
	public String         getName()        { return name;      }
	public Set<Product>   getAllProducts() { return products;  }
		
	public void setName(String name)     { this.name = name;   }
	public void addProduct(Product pr)   { products.add(pr);   }
}
