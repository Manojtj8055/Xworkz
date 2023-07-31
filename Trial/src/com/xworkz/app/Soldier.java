package com.xworkz.app;

public class Soldier extends Warrior {

	
	String type;
	int Power;
	public Soldier(String name, int rules, boolean justice,
		String position, String style, int capacity, String type,int power) 
	{
		super(name, rules, justice, position, style, capacity);
		this.type = type;
		this.Power = power;
	}
	
	@Override
	public void printinfo() {
		
		super.printinfo();

		System.out.println("Soldier type is " + type);
		System.out.println("Soldier Power is " + Power + " ManPower");
		System.out.println("");
		System.out.println("||||||||||||||||||||||||||||||||||||||||");
	}
	
	
	
}
