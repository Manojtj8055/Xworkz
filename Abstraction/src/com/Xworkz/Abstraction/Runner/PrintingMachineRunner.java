package com.Xworkz.Abstraction.Runner;

import com.Xworkz.Abstraction.app.Tony.CanonPrintingMachine;
import com.Xworkz.Abstraction.app.Tony.Tony;

public class PrintingMachineRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Printing machine runner\n");
		
		CanonPrintingMachine machine = new CanonPrintingMachine();
		
		Tony chopper = new Tony(machine);
		chopper.getPrint();

	}

}