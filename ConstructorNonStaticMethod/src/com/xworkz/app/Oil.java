package com.xworkz.app;

class Oil{
	String brand;
	long quantity;
	int price;
	String type;
	double density;
	
	Oil(String brand,long quantity,int price,String type,double density){
		System.out.println("Running string,long,int,string,double constructor in Oil");
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
		this.type = type;
		this.density = density;
	}
	void info(){
		System.out.println("Running non static method in Oil");
		System.out.println("Oil brand : " + brand);
		System.out.println("Oil quantity : " + quantity);
		System.out.println("Oil price : " + price);
		System.out.println("Oil type : " + type);
		System.out.println("Oil density : " + density);
		
		

	}
	
	
}
