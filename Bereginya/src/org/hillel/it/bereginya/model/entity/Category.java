package org.hillel.it.bereginya.model.entity;

import java.util.*;


public class Category {
	private int id;
	private String name;
	private int ParentCategory;
	private Set<Product> products = new HashSet<Product>();
	
	public Category(int ID, String name) {		
		this.id = ID;
		this.name = name;
	}

	public int            getId()             { return id;	           }
	public String         getName()           { return name;           }
	public Set<Product>   getAllProducts()    { return products;       }
	public int            getParentCategory() { return ParentCategory; }
		
	public void setParentCategory(int pCategory) { ParentCategory = pCategory; }
	public void setName(String name)             { this.name = name;           }
	public void addProduct(Product pr)           { products.add(pr);   }
}
