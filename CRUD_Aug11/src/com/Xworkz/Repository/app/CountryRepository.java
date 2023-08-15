package com.Xworkz.Repository.app;

public interface CountryRepository {

	void Country(String name);
	
	void diplay();
	
	int TOTAL_COUNTRY=10;
	
	boolean isExist(String name);
	
	void findStartsWith(String name);
	
	void findEndsWith(String name);
	
	String returnUpperCase(String name);

   	void orderAscending();
	
	void orderDescending();

	int savedCount(String[] arr);
	
	
}
