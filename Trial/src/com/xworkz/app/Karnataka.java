package com.xworkz.app;

public class Karnataka extends India{

	private String type2 ;
	private String side;
	public Karnataka(String type, String currency, String type2, String side) {
		
		super(type, currency);
		this.type2 = type2;
		this.side = side;
	}
	
	public void printinfo() {
		
System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
super.printinfo();

		System.out.println("Karnataka is a  " + type2 );
		System.out.println("Side of the state is " + side);
		
		
	}
	
	
	
}
