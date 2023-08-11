package com.xworkz.Respository.Runner;

import com.xworkz.Respository.app.Olympic.OlympicRepository;
import com.xworkz.Respository.app.Olympic.OlympicRepositoryImpl;

public class OlympicRunner {

	public static void main(String[] args) {
		
		System.out.println("Main in Olympic Runner");
		
		OlympicRepository repository=new OlympicRepositoryImpl();
		repository.year("1908");
		repository.year("1920");
		repository.year("1924");
		repository.year("1928");
		repository.year("1932");
		repository.year("2024");
		System.out.println("|||||||||||||||||||||||||||");
		repository.display();
		

	}

}
