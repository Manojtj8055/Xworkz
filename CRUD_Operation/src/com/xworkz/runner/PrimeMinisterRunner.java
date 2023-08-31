package com.xworkz.runner;

import com.xworkz.dto.PrimeMinisterDTO.PrimeMinisterDTO;

import com.xworkz.service.PM.PrimeMinisterService;
import com.xworkz.service.PM.PrimeMinisterServiceImpl;

public class PrimeMinisterRunner {

	public static void main(String[] args) {

		PrimeMinisterDTO ministerDTO=new PrimeMinisterDTO(01, "Narendra Modi", "INDIA", "Baratiya Janatha Party");
		
		
		
		PrimeMinisterService primeMinisterService =new PrimeMinisterServiceImpl(null);
		
		
		boolean result=primeMinisterService.validate(ministerDTO);
		
		if(result) {
			System.out.println("Data being saved is : " + result );
		return ;
		}
		else {
			System.err.println("Data being saved is : " +result );
		}
		
		System.out.println("---------------------------");
	
		primeMinisterService.findByName("Narendra Modi");
	}

}
