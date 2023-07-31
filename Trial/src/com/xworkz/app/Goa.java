package com.xworkz.app;

public class Goa extends India{

	private String type3 ;
	private String side1;
	public Goa(String type, String currency, String type3, String side1) {
		
		super(type, currency);
		this.type3 = type3;
		this.side1 = side1;
	}
	
	public void printinfo() {
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
	    super.printinfo();

	    System.out.println("Goa is a  " + type3 );
		System.out.println("Side of the state is " + side1);
		
		
	}
	
	
	
}
