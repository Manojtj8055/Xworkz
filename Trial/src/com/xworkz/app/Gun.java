package com.xworkz.app;

public class Gun {

	
	private String Name;
	private String Type;
	private int no;
	private float price;
	private boolean fires;
	private String purpose;
	
	public Gun() {
		
		System.out.println("Running no arg constructor of Gun");
		
	}
	public Gun(String Name, String Type, int no) {
		System.out.println("Running string,string,int constructor of gun");
		this.Name = Name;
		this.Type = Type;
		this.no = no;
	}
	public Gun(String name, String type, int no, float price, boolean fires, String purpose)
	{
		this(name,type,no);
		System.out.println("Running string,string,int,float,boolean,string constructor of gun");
		this.price = price;
		this.fires = fires;
		this.purpose = purpose;
	}
	
	@Override
	public String toString() {
		return "Name of the gun-->" + Name + "\n" + "Type of a gun-->" + Type + "\n" + "No of bullets-->" + no + "\n" + "Price =" + price + "\n" 
	+  "Fires " + fires + "\n" + "Purpose of use" + purpose;
	}
	
	



}
