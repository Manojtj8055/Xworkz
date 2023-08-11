package com.xworkz.Respository.app.Apartment;

public interface ApartmentRepository {

	void save(String name);
	
	int TOTAL_NAMES = 5;
	
	void display();
}
