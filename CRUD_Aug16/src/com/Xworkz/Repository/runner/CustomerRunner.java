package com.Xworkz.Repository.runner;

import com.Xworkz.Repository.app.Customer.CustomerDTO;
import com.Xworkz.Repository.app.Customer.CustomerRepository;
import com.Xworkz.Repository.app.Customer.CustomerRepositoryImpl;

public class CustomerRunner {

	public static void main(String[] args) {

	System.out.println("running main in customer runner\n");
	
	CustomerDTO dto = new CustomerDTO("Manoj","manutj805517@gmail.com","Shimoga", false);
	CustomerRepository repository = new CustomerRepositoryImpl();
	
	repository.save(dto);
	}

}
