package com.Xworkz.Runner;

import com.Xworkz.DTO.CookDTO;
import com.Xworkz.DTO.Service.Cook.CookServiceImpl;

public class CookRunner {
	public static void main(String[] args) {
		System.out.println("Save and Validate operation is running in Cook Runner\n");
		
		CookDTO cookDTO  = new CookDTO("Biriyani", "Bright Hotel", "Male", 45000);
		
		CookServiceImpl cookService =  new CookServiceImpl();
		cookService.saveAndValidate(cookDTO);

	}

}
	

