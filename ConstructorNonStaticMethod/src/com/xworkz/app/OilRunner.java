package com.xworkz.app;

class OilRunner{
	public static void main(String[] args){
						System.out.println(" ");
		System.out.println("Running main in OilRunner...");
		System.out.println(" ");
		
		System.out.println("calling 1st constructor from OilRunner...");
	Oil ref1 = new Oil("Indian oil" , 2000 , 101 , "Petrol" , 74.5);
	ref1.info();
			System.out.println(" ");

	
			
	    System.out.println("calling 2nd constructor from OilRunner...");
    Oil ref2 = new Oil("HP" , 1000, 110 , "Petrol" , 73.2);
ref2.info();
		System.out.println(" ");
	
	
	    System.out.println("calling 3rd constructor from OilRunner...");
    Oil ref3 = new Oil("Bharat Petrolium" , 5000 , 105 , "Diesel" , 85.3);
	ref3.info();
			System.out.println(" ");
			
			System.out.println("calling 4th constructor from oilrunner");
			Oil ref4=new Oil("Aegis" , 2003,232,"Gas",60.3);
			ref4.info();
			System.out.println("");

	}
}
