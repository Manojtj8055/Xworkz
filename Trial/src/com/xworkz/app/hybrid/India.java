package com.xworkz.app.hybrid;

public class India {

	private String type;
	private String Currency;
	public India(String type, String currency) {
		
		this.type = type;
		this.Currency = currency;
	}
	
	public void printinfo() 
	{
		
		System.out.println("India is a  " + type );
		System.out.println("Currency is " + Currency);
	}
	

}
