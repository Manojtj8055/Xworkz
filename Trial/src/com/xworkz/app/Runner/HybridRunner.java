package com.xworkz.app.Runner;

import com.xworkz.app.Goa;
import com.xworkz.app.India;
import com.xworkz.app.Karnataka;
import com.xworkz.app.Shimoga;

public class HybridRunner {

	public static void main(String[] args) {

		India india = new India("Country","Rupees");
		india.printinfo();
		
		Karnataka karnataka = new Karnataka("Country","Rupees", "State", "SouthIndia");
		karnataka.printinfo();
		
		Goa goa = new Goa("Country","Rupees", "State", "SouthWestIndia");
		goa.printinfo();
		
		Shimoga shimoga = new Shimoga("Country","Rupees", "State", "SouthIndia", "District", 14);
		shimoga.printinfo();
		
	}

}
