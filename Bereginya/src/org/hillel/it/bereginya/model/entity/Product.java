package org.hillel.it.bereginya.model.entity;

import java.io.File;

public class Product {	
	private int id;
	private String name;
	private String description;
	private float price;
	File foto;
	private StockStatus status;
	private int count;
	private Manufacturer factory;
	private Category category;
	private static int iter = 0;
	

	public Product(String name) {		
		id = ++iter;
		this.name = name;
		price = (float) 0.0;
		status = StockStatus.NOT_AVAILABLE;
		count = 0;		
	}


	public Product(String name, Manufacturer factory, Category category, String description, float price,
			File foto, int count) {
		id = ++iter;
		this.name = name;
		this.description = description;
		this.price = price;
		this.foto = foto;
		this.factory = factory;
		this.category = category;
		this.count = count;
		if(count>0) 
			status = StockStatus.AVAILABLE;
		else
			status = StockStatus.NOT_AVAILABLE;
	}
    
	public int           getId()            { return id;	        }
	public String        getName()          { return name;	        }
	public String        getDescription()   { return description;	}
	public float         getPrice()         { return price;	        }
	public StockStatus   getStatus()        { return status;	    }
	public int           getCount()         { return count;	        }
	public Manufacturer  getManufacturer()  { return factory;       }
	public Category      getCategory()      { return category;      }

	public void setName(String name)                  {	this.name        = name;        }
	public void setDescription(String description)    {	this.description = description;	}
	public void setPrice(float price)                 {	this.price       = price;       }
	public void setCount(int count)                   {	this.count       = count;	    }
}
