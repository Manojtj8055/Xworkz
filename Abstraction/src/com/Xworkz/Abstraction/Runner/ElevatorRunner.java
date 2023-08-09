package com.Xworkz.Abstraction.Runner;

import com.Xworkz.Abstraction.app.luffy.Elevator;
import com.Xworkz.Abstraction.app.luffy.Luffy;
import com.Xworkz.Abstraction.app.luffy.ShowRoom;

public class ElevatorRunner {

	public static void main(String[] args) {
		System.out.println("Running main in elevator runner\n");
		Elevator elevator=new ShowRoom();
		
		Luffy luffy=new Luffy(elevator);
		
		luffy.getCarry();
	}
}
