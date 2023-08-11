package com.xworkz.Respository.Runner;

import com.xworkz.Respository.app.Politician.PoliticianRepository;
import com.xworkz.Respository.app.Politician.PoliticianRepositoryImpl;

public class PoliticianRunner {

	public static void main(String[] args) {

		System.out.println("Running main in Poltician Runner");
		System.out.println("......................................");
		PoliticianRepository repository=new PoliticianRepositoryImpl();
		repository.name("BSY");
		repository.name("DKS");
		repository.name("HDK");
		repository.name("Eshwarappa");
		repository.name("BC patil");
		
		System.out.println("++++++++++++++++++++++++++");
		
		repository.display();

	}

}
