package com.Xworkz;

public class Engine {

	static String Type; 
	int weight;
	
public static void main(String []args)	{
		System.out.println("Runnig main in Engine");
		
		Engine ref1=new Engine();
		Engine ref2=new Engine();

		ref1.weight=2;
		ref2.weight=3;
		
		ref1.getweight();
		System.out.println();
		ref2.getweight();
		
		
	
	
	}
static {
	Engine.Type="V4";
}

	static void getType() {
		System.out.println("Engine Type is :"  + Engine.Type);
	
}
void getweight() {
	System.out.println("Running non static method in Enigne");
	System.out.println("Number of vaccum needed :"  +this.weight );
	getType();
}
}