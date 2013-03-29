package org.hillel.it.bereginya.model.entity;

public enum Role {
	ADMIN(0), SHOPPER(1);
	
	private int access;
	
	//Enum Constructor 
	Role(int access) { this.access = access; }
	
	//Method return type of access
	int getAccess()  { return access;        }

}
