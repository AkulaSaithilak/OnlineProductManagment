package com.model;

public class products {
	private int id;
	private int price;

	private String name;
	private String type;
	
	public products() {
	
	}
	public products(int id, int price, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
