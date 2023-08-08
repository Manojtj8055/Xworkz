package com.xworkz.diamond.Runner;

import com.xworkz.diamond.CMpolicy;
import com.xworkz.diamond.DCMpolicy;
import com.xworkz.diamond.People;
import com.xworkz.diamond.Politics;

public class PeopleRunner {

	public static void main(String[] args) {

		
		CMpolicy cMpolicy=new Politics();
		cMpolicy.PromiseCongressGovt();
		cMpolicy.GruhaJyothi();
		System.out.println("----------------------------");		
			
		DCMpolicy dcMpolicy=new Politics();
		dcMpolicy.PromiseCongressGovt();
		dcMpolicy.YuvaNidhi();
		
		System.out.println("--------------------");
		
		People people=new Politics();
		people.PromiseCongressGovt();
		people.GruhaJyothi();
		people.YuvaNidhi();
		
		System.out.println("---------------------");
		
		Politics politics=new Politics();
		politics.PromiseCongressGovt();
		politics.GruhaJyothi();
		politics.YuvaNidhi();
	}	
	
	
}
