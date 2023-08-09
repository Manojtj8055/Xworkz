package com.Xworkz.Abstraction.app.Tony;

public class Tony {
	
	private PrintingMachine machine;
	
	public Tony(PrintingMachine machine) {
		this.machine = machine;
	}

	
	public void getPrint() {
		if(machine!=null) {
			System.out.println("Machine is not null");
			this.machine.print();
		}
		else {
			System.err.println("machine is null cannot print");
		}
	}
}