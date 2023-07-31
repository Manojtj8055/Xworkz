package com.xworkz.app;

public class CocoCola extends Drink{

	String Taste;
	int Quantity;
	
	public CocoCola(String type, int brand, String taste, int quantity) 
	{
		super(type, brand);
		this.Taste = taste;
		this.Quantity = quantity;
	}
	
	public void printinfo() {
		System.out.println("CocoCola is a " + type );
		System.out.println("CocoCola is a No ----> " + brand + " brand");
		System.out.println("CocoCola tastes " + Taste );
		System.out.println("CocoCola buying quantity is " + Quantity + " ml" );

	}
	
	
	
	
}
