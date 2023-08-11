package com.xworkz.Respository.Runner;

import com.xworkz.Respository.app.Apartment.ApartmentRepository;
import com.xworkz.Respository.app.Apartment.ApartmentRepositoryImpl;

public class ApartmentRunner {

	public static void main(String[] args) {

		
		System.out.println("Save the value of index");
		
		ApartmentRepository repository=new ApartmentRepositoryImpl();
		repository.save("Pramukh");
		repository.save("Global");
		repository.save("Shobha");
		repository.save("HKM");
		repository.save("AIR");
		
		repository.display();
	}

}
