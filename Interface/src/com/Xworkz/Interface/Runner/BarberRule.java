package com.Xworkz.Interface.Runner;

import com.Xworz.Interrface.app.salon.SalonRule;

public class BarberRule implements SalonRule{
	
	public void getPrice() {
		System.out.println("Fixed rate of salon");
	}
	
	public void getLine() {
		System.out.println("Order of haircut depends on line");
	}

}
