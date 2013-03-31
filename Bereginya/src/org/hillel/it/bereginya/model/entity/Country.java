package org.hillel.it.bereginya.model.entity;

import java.util.*;

public class Country {
	private static int iter = 0;
	private int id;
	private String name;
	Set<Manufacturer> mf = new HashSet<Manufacturer>();
	
	
	public Country(String name) {
		id = ++iter;
		this.name = name;
	}


	public int               getIdCountry()    { return id;   }
	public String            getName()         { return name; }
	public Set<Manufacturer> getAllProducts()  { return mf;   }
	
	public void setName(String name)                        { this.name = name;    }		
	public void addManufacture(Manufacturer manufacture)    { mf.add(manufacture); }
	public void removeManufacture(Manufacturer manufacture) { mf.remove(mf);       }
}
