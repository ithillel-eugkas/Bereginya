package org.hillel.it.bereginya.model.entity;

public class Manufacturer {
	private String name;
	private String country;
	
	public Manufacturer(String name, String country) {	
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void editName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void editCountry(String country) {
		this.country = country;
	}
}
