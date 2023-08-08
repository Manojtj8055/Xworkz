package com.xworkz.diamond;

public class BtmCoolDrinkRunner {

	public static void main(String[] args) 
	{
		PepsiCoolDrink pepsiCoolDrink=new BtmCoolDrink();
		pepsiCoolDrink.cool();
		pepsiCoolDrink.energy();
		System.out.println("");
		CokeCoolDrink cokeCoolDrink=new BtmCoolDrink();
		cokeCoolDrink.cool();
		cokeCoolDrink.taste();
		System.out.println("");
		GoodDrink goodDrink=new BtmCoolDrink();
		goodDrink.cool();
		goodDrink.energy();
		goodDrink.taste();
		System.out.println("");
		BtmCoolDrink btmCoolDrink=new BtmCoolDrink();
		btmCoolDrink.cool();
		btmCoolDrink.energy();
		btmCoolDrink.taste();
	}
}
