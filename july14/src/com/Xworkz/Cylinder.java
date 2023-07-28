package com.Xworkz;


public class Cylinder {

	static String brand;
	double capacity;

	public static void main(String[] args) {
				System.out.println("Running main in Cylinder");
				  
				Cylinder ref1  = new Cylinder();
				  Cylinder ref2  = new Cylinder();
				  
				  ref1.capacity = 3016;
				  ref2.capacity = 3008;
				  
				  ref1.getcapacity();
				  System.out.println("");
				  ref2.getcapacity();

				  
				

			}
			static {
				Cylinder.brand = "Air Tac";
			}
			
				static void getbrand() {
					System.out.println("Cylinder brand is :" + Cylinder.brand);
					
				}
				
				 
				 void getcapacity() {
					System.out.println("Running non static method in Cylinder");
					System.out.println("Cylinder capacity is : " + this.capacity);
					getbrand();

					
				
				}
}
