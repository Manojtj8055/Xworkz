package com.Xworkz;

public class Coastal {

	
	static String state;
	String side;
	
	public static void main(String[] args) {
	System.out.println("Running main in Coastal");
	
	Coastal ref1 = new Coastal();
	Coastal ref2 = new Coastal();
	
	ref1.side="west";
	ref2.side="east";
	
	ref1.getside();
	ref2.getside();
	 


	}
	static {
		Coastal.state ="Manoglore" ;
	}
	
	static void getstate(){
		System.out.println("Coastal region is :" + Coastal.state);
	}
	void getside() {
		System.out.println("Running non static method in Coastal");
		System.out.println("Coastal side is:" + this.side);
		getstate();
	}

}
