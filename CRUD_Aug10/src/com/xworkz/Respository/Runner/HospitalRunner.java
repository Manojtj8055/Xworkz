package com.xworkz.Respository.Runner;

import com.xworkz.Respository.app.Hospital.HospitalRepository;
import com.xworkz.Respository.app.Hospital.HospitalRepositoryImpl;

public class HospitalRunner {

	public static void main(String[] args) {
		System.out.println("Hospital initialized index value");
		HospitalRepository repository=new HospitalRepositoryImpl();
		repository.name("Mcgann");
		repository.name("Apollo");
		repository.name("Manipal");
		repository.name("Aester");
		repository.name("Victoria");
		repository.name("KIMS");
		
		System.out.println("||||||||||||||||||||||||||||||||||||||");
		
		repository.display();
	}
}
