package com.Xworkz;

public class NailCutter {

	
	static String company;
	int radius;
	
	public static void main(String[] args) {
	System.out.println("Running main in Nailcutter");
	
	NailCutter ref1 = new NailCutter();
	NailCutter ref2 = new NailCutter();
	
	ref1.radius=4;
	ref2.radius=5;
	
	ref1.getradius();
	ref2.getradius();
	 


	}
	static {
		NailCutter.company ="halim" ;
	}
	
	static void getcompany(){
		System.out.println("Coastal region is :" + NailCutter.company);
	}
	void getradius() {
		System.out.println("Running non static method in NailCutter");
		System.out.println("NailCutter side is:" + this.radius);
		getcompany();
	}

}
