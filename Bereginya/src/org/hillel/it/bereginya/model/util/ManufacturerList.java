package org.hillel.it.bereginya.model.util;

import java.util.Iterator;
import java.util.LinkedList;

import org.hillel.it.bereginya.model.entity.Manufacturer;

public class ManufacturerList {
	private LinkedList<Manufacturer> manufacturerList;

	public ManufacturerList() {	
		manufacturerList = new LinkedList<Manufacturer>();
	}
	
	
	//Add new manufacturer to list
	public void addFabricator(String name, String country) {				
		manufacturerList.add(new Manufacturer(name, country));					
	}
	
	
	//Search Manufacturer by name and remove it from list
	public void removeFabricator(String name) {
		Iterator<Manufacturer> itr = manufacturerList.iterator();
		while(itr.hasNext()) {
			if(itr.next().getName() == name) {
				manufacturerList.remove(itr);				
				break;
			}			
		}
	}
	
	//Clear list of Manufacturers
	public void clear() {
		manufacturerList.clear();
	}

}
