package com.xworkz.app.heirarchy;

public class Flower extends Plants{

	
	private String Name ;
	private String color;
	
	
	public Flower(String weather, String region, String name, String color) 
	{
		super(weather, region);
		this.Name = name;
		this.color = color;
	}
	
public void printinfo() {
		
		super.printinfo();
		System.out.println("Name of the Flower is :" + Name);
		System.out.println("color of the Flower is :" + color);

	}
	
}
