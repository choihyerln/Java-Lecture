package ch18_io.object;

import java.io.Serializable;

public class Product implements Serializable{
	
	private static final long serialVersionUID = 8411235393030359653L;
	private String name;
	private int price;
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}
