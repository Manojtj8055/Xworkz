package com.xworkz.app.Runner;

import com.xworkz.app.Gun;

public class ConstructorOverLoadingGunRunner {

	public static void main(String[] args) {

		System.out.println("Running main in constructor over loading gun runner");
		
		Gun gun1 = new Gun();
		System.out.println(gun1);
		System.out.println("++++++++++++++++-----+++++++++");
		
		Gun gun2 = new Gun("Ak47","Rifle",40);
		System.out.println(gun2);
		System.out.println("++++++++++++++++-----+++++++++");

		
		Gun gun3 = new Gun("DEagle","Revolver",12,25000,true,"Self Protection");
		System.out.println(gun3);
	}

}
