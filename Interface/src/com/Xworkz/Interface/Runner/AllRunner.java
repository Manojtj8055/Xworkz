package com.Xworkz.Interface.Runner;

import com.Xworz.Interrface.app.Devotee.Devotee;
import com.Xworz.Interrface.app.HomeRule.IsmailHomeRule;
import com.Xworz.Interrface.app.airport.AirportRule;
import com.Xworz.Interrface.app.airport.BangloreAirportRule;
import com.Xworz.Interrface.app.company.CompanyRule;
import com.Xworz.Interrface.app.company.EmployeeRule;
import com.Xworz.Interrface.app.patent.NewProduct;
import com.Xworz.Interrface.app.salon.SalonRule;
import com.Xworz.Interrface.app.temple.TempleRule;

public class AllRunner {

	public static void main(String[] args) {

		
		System.out.println("** AirPortRule **");
		BangloreAirportRule bangloreAirportRule=new BangloreAirportRule();
		System.out.println("Airport Location is :" + AirportRule.LOCATION);
		bangloreAirportRule.getPassPort();
		bangloreAirportRule.getTicket();
	
	
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		
		System.out.println("** ArmyRule  **");
		IndianArmyRule indianArmyRule=new IndianArmyRule();
		System.out.println("Army Location is :" + IndianArmyRule.Country );
		indianArmyRule.getBorder();
		indianArmyRule.getEnemies();
		
		

		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		
		System.out.println("** HomeRule  **");
		IsmailHomeRule ismialHomeRule=new IsmailHomeRule();
		System.out.println("Home Rule of "  + IsmailHomeRule.name + " is ");
		ismialHomeRule.getHome();
		ismialHomeRule.getSleep();
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("** PatentRule  **");
		NewProduct newProduct=new NewProduct();
		System.out.println(" Type of patent rule is " + NewProduct.type);
		newProduct.getSymbol();
		newProduct.getTR();
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		
		
		System.out.println("** SalonRule  **");
		BarberRule barberRule=new BarberRule();
		System.out.println("Charge " + SalonRule.price + " for a Customer");
		barberRule.getLine();
		barberRule.getPrice();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		System.out.println("** Temple Rule  **");
		Devotee devotee = new Devotee();
		System.out.println("Things " + TempleRule.type + " in temple");
		devotee.getShortDresses();
		devotee.getSlipperoff();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("** Company Rule  **");
		EmployeeRule employeeRule=new EmployeeRule();
		System.out.println("Basic rules = " + CompanyRule.type);
		employeeRule.getOne();
		employeeRule.getTwo();
		
		
		
		
	}

}
