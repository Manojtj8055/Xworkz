package com.xworkz.app.heirarchy;

public class Vegetable extends Plants {

	private String VName;
	private boolean spice;
	
	
	public Vegetable(String weather, String region, String vname, boolean spice)
	{
		super(weather, region);
		this.VName = vname;
		this.spice = spice;
	}
	
public void printinfo() {
		
	
		super.printinfo();
		System.out.println("Vegetable name is : " + VName);
		System.out.println("Vegetable is spice = " + spice);

	}
	
}
