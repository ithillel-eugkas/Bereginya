package org.hillel.it.bereginya.model.entity;

import java.io.File;

public class Product {	
	private int id;
	private String name;
	private String description;
	private float price;
	File foto;
	private boolean status;
	private int count;
	

	public Product(int id, String name) {		
		this.id = id;
		this.name = name;
		price = (float) 0.0;
		status = false;
		count = 0;		
	}


	public Product(int id, String name, Manufacturer maker, Category category, String description, float price,
			File foto, int count) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.foto = foto;
		this.count = count;
		if(count>0) 
			status = true;
		else
			status = false;
	}
    
	//Return Product_ID
	public int getId() {  
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//Return Product_Name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    //Return Description of product
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
