package com.Xworkz.Runner;

import com.Xworkz.DTO.MechanicDto;
import com.Xworkz.DTO.Service.Mechanic.MechanicServiceImpl;

public class MechanicRunner {

	public static void main(String[] args) {

		System.out.println("Save and Validate operation is running in Mechanic Runner\n");

		MechanicDto dto = new MechanicDto("Ducatti", 8377646,"SuperBike", 4500);
		
		MechanicServiceImpl mechanicService = new MechanicServiceImpl();
		mechanicService.saveAndValidate(dto);
		
		
		
		
		
	}

}
