package com.Xworkz.Abstraction.app.luffy;

public class Luffy {

	Elevator elevator;
	
	public Luffy(Elevator elevator) {
		this.elevator=elevator;
	}
	public void getCarry() {
		if(elevator!=null) {
			System.out.println("Elevator is not null");
			this.elevator.carry();
			
		}
		else {
			System.err.println("Elevator is null,cannot carry");
		}
	}
}
