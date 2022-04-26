package com.javaex.ex02;

public class Goods {

	//field
	private String name;
	private int price;
	
	//constructor
	public Goods() {
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	//method - g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//method-general
	public void showInfo() {
		System.out.println("상품명: "+name+", 가격:"+price);
	}
}




