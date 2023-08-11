package com.xworkz.Respository.Runner;

import com.xworkz.Respository.app.Army.ArmyRepository;
import com.xworkz.Respository.app.Army.ArmyRepositoryImpl;

public class ArmyRunner {

	public static void main(String[] args) {

		System.out.println("run in main runner");
		
		ArmyRepository repository=new ArmyRepositoryImpl();
		repository.save("India");
		repository.save("India1");
		repository.save("India2");
		repository.save("India3");
		repository.save("India4");
		System.out.println("+++++++++++++++++++++++++++++");
		repository.display();

		
	}

}
