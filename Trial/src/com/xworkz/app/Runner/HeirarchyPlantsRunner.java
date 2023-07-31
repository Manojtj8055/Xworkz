package com.xworkz.app.Runner;

import com.xworkz.app.heirarchy.Flower;
import com.xworkz.app.heirarchy.Vegetable;

public class HeirarchyPlantsRunner {

	public static void main(String[] args) {

		Flower flower = new Flower("Monsoon","Sakleshpura", "NeelKuranji", "Purple");
		flower.printinfo();
		
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		
		Vegetable vegetable = new Vegetable("Winter","Karnataka","Tomato", false);
		vegetable.printinfo();
		
		
		
		
	}

}
