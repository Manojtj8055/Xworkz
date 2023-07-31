package com.xworkz.app.multi;

public class King {

	
	String Name;
	int Rules;
	boolean Justice;
	public King(String name, int rules, boolean justice) {
		
		this.Name = name;
		this.Rules = rules;
		this.Justice = justice;
	}
	

public void printinfo() {
		
		System.out.println("The King name is " + Name );
		System.out.println("King Rules " + Rules + " states");
		System.out.println("Justice = " + Justice);
		System.out.println("");
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.println("");
	
}
}
