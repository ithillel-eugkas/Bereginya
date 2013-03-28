package org.hillel.it.bereginya.model.entity;

public class OrderConsist {
	private Product product;
	private int count;
	
	public OrderConsist(Product product, int count) {
		this.product = product;
		this.count = count;
	}

	public Product getProduct() {
		return product;
	}

	public void editProduct(Product product) {
		this.product = product;
	}

	public int getCount() {
		return count;
	}

	public void editCount(int count) {
		this.count = count;
	}
}
