package org.hillel.it.bereginya.model.util;

import java.util.*;

import org.hillel.it.bereginya.model.entity.Manufacturer;

public class ManufacturerList {
	private Set<Manufacturer> manufacturers;

	public ManufacturerList() {	
		manufacturers = new HashSet<Manufacturer>();
	}
	
	
	//Add new manufacturer to list
	//public void addFabricator(String name, String country) {				
	//	manufacturers.add(new Manufacturer(name, country));					
	//}
	
	
	//Search Manufacturer by name and remove it from list
	public void removeFabricator(String name) {
		Iterator<Manufacturer> itr = manufacturers.iterator();
		while(itr.hasNext()) {
			if(itr.next().getName() == name) {
				manufacturers.remove(itr);			
				break;
			}			
		}
	}
	
	//Clear list of Manufacturers
	public void clear() {
		manufacturers.clear();
	}

}
