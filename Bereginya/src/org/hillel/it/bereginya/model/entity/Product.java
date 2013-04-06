package org.hillel.it.bereginya.model.entity;

import java.io.File;

public class Product {	
	private final int id;
	private String name;
	private String description;
	private float price;
	File ImageHREF;
	private StockStatus status;
	private int count;
	private Manufacturer factory;
	private Category category;
	private static int iteratorID = 0;
	

	public Product(String name) {		
		id = ++iteratorID;
		this.name = name;
		price = (float) 0.0;
		setCount(0);
	}

	public Product(String name, Manufacturer factory, Category category, float price,
			File ImageHREF, int count) {
		id = ++iteratorID;
		this.name = name;
		this.price = price;
		this.ImageHREF = ImageHREF;
		this.factory = factory;
		this.category = category;
		setCount(count);		
	}
	
	public Product(String name, Manufacturer factory, Category category, String description, float price,
			File ImageHREF, int count) {
		id = ++iteratorID;
		this.name = name;
		this.description = description;
		this.price = price;
		this.ImageHREF = ImageHREF;
		this.factory = factory;
		this.category = category;
		setCount(count);		
	}
    
	public int           getId()         					   { return id;	           }
	public String        getName()     						   { return name;	       }
	public String        getDescription() 					   { return description;   }
	public float         getPrice()                            { return price;	       }
	public StockStatus   getStatus()  					       { return status;	       }
	public int           getCount()         				   { return count;	       }
	public Manufacturer  getManufacturer()  				   { return factory;       }
	public Category      getCategory()                         { return category;      }
	public void          setName(String name)                  { this.name        = name;           }
	public void          setDescription(String description)    { this.description = description;	}
	public void          setPrice(float price)                 { this.price       = price;          }
	
	public void setCount(int newCount) {	
		this.count = newCount;
		if(newCount > 0) {	
			status = StockStatus.AVAILABLE;
		} 
		else {
			status = StockStatus.AVAILABLE;
		}		
	}
}
