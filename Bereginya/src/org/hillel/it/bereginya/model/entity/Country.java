package org.hillel.it.bereginya.model.entity;

import java.util.*;

public class Country {
	private static int iteratorID = 0;
	private final int id;
	private String name;
	Set<Manufacturer> mf;
	
	
	public Country(String name) {
		id = ++iteratorID;
		this.name = name;
		if(mf == null) mf = new HashSet<Manufacturer>();
	}


	public int               getIdCountry()    { return id;   }
	public String            getName()         { return name; }
	public Set<Manufacturer> getAllProducts()  { return mf;   }
	
	public void setName(String name)                        { this.name = name;    }		
	public void addManufacture(Manufacturer manufacture)    { mf.add(manufacture); }
	public void removeManufacture(Manufacturer manufacture) { mf.remove(mf);       }
}
