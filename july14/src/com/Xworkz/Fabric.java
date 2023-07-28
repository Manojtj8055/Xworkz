package com.Xworkz;

public class Fabric {

	static String Type;
	String brand;
	
	public static void main(String[] args)
	{
     System.out.println("Running main in Fabric");
     
     Fabric ref1=new Fabric();
     Fabric ref2=new Fabric();

     ref1.brand="RareRabit";
     ref2.brand="HugoBoss";
     
     ref1.getbrand();
     System.out.println("");
     ref2.getbrand();
	}
	
	static {
		Fabric.Type="Cotton";
	}
	
	
	static void getType(){
		System.out.println("Fabric Type is :" + Fabric.Type);
		
	}
	
	
	void getbrand() {
		System.out.println("Running non static method in Fabric");
		System.out.println("brand name is :" + this.brand);
	    getType();
	}
	
	
	
	

     

     
     
	


}
