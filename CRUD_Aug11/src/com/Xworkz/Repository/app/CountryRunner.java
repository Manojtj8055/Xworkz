package com.Xworkz.Repository.app;

public class CountryRunner {

	public static void main(String[] args) {

		CountryRepository repository=new CountryRepositoryImpl();
		repository.Country("India");
		repository.Country("Australia");
		repository.Country("China");
		repository.Country("USA");
		repository.Country("Portugal");
		repository.Country("Brazil");
		repository.Country("England");
		repository.Country("Sri-Lanka");
		repository.Country("South-Africa");
		repository.Country("Russia");
		repository.Country("Pakistan");
		
		System.out.println("------------------------------------");
		
		repository.diplay();
		
		System.out.println("-------------------------------------");
		repository.isExist("India");
		repository.isExist("South-Africa");
		repository.isExist("Portugal");

		

		
		System.out.println("--------------------------------------");
		repository.findStartsWith("S");
		repository.findStartsWith("A");
		
		
		
		System.out.println("-----------------------------------------");
		repository.findEndsWith("a");
	}

}
