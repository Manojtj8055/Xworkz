package com.Xworkz.Abstraction.app.Tony;

public class PrintingMachineRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Printing machine runner\n");
		
		PrintingMachine machine = new CanonPrintingMachine();
		
		Tony chopper = new Tony(machine);
		chopper.getPrint();

	}

}