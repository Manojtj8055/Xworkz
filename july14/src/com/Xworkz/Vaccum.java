package com.Xworkz;

public class Vaccum {

	
	static String company;
	int quantity;
	
	public static void main(String[] args) {
	System.out.println("Running main in vaccum");
	
	
		Vaccum ref1=new Vaccum();
		Vaccum ref2=new Vaccum();

		
		ref1.quantity= 2;
	    ref2.quantity= 4;
	    
	    ref1.getquantity();
	    System.out.println("");
	    ref2.getquantity();


	}
	
	static {
		Vaccum.company="Kaka";
	}
	static void getcompany() {
		System.out.println("Vaccum company is :"  + Vaccum.company);
	}
	
	void getquantity() {
		System.out.println("Running non static method in Vaccum");
		System.out.println("Number of vaccum needed :"  +this.quantity );
		getcompany();

	}

}
