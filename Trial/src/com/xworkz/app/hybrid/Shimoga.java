package com.xworkz.app.hybrid;



public class Shimoga extends Karnataka{

	
	private String type4 ;
	private int no;
	
	public Shimoga(String type, String currency, String type2, String side,String type4,int no)
	{
		
		super(type,currency,type2,side);
		this.type4 = type4;
		this.no = no;
	}
	
	public void printinfo() {
		
		
		super.printinfo();

		System.out.println("Shimoga is a  " + type4 );
		System.out.println("Registration no of District is " + no);
		
		System.out.println("**************************************************************");
	}
	
	

}
