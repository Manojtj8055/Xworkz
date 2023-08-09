package com.Xworkz.Abstraction.Runner;

import com.Xworkz.Abstraction.app.Zoro.HumanKidney;
import com.Xworkz.Abstraction.app.Zoro.Kidney;
import com.Xworkz.Abstraction.app.Zoro.Zoro;

public class KidneyRunner {

	public static void main(String[] args) {
		
		System.out.println("running main in kidneyrunner\n");
		
		Kidney kidney=new HumanKidney();
		
		Zoro zoro=new Zoro(kidney);
		zoro.check();
	}

}
