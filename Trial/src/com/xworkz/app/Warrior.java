package com.xworkz.app;

public class Warrior extends King{

	
	String position;
	String style;
	int Capacity;
	public Warrior(String name, int rules, boolean justice, String position, String style, int capacity) {
		super(name, rules, justice);
		this.position = position;
		this.style = style;
		this.Capacity = capacity;
	}
	
	@Override
public void printinfo() {
		
	
		super.printinfo();

		System.out.println("Warrior is Loyal to King");
		System.out.println("Warrior Position is " + position );
		System.out.println("Warrior " + style);
		System.out.println("Warrior leads " + Capacity + " Soldiers");
		System.out.println("");
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.println("");
	
	
}
	
}
