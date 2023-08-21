package com.Xworkz.DTO.Service.Mechanic;

import com.Xworkz.DTO.MechanicDto;

public class MechanicServiceImpl implements MechanicService {

	@Override
	public void saveAndValidate(MechanicDto dto) {

		if(dto!=null) {
			 String garageName = dto.getGarageName();
			 double gstNumber = dto.getGstno();
			 double bikeServiceCost = dto.getBikeServiceCost();
			 String specialization = dto.getSpecialization();
			 
			 if(garageName!=null && !garageName.isEmpty() && garageName.length()>3 && garageName.length()<100) {
					System.out.println("Garage Name is :'" + garageName + "' it is valid");
				}
				else {
					System.err.println("Garage Name is :'" + garageName + "' it is invalid");
				}
			 
			 if(gstNumber>0) {
				 System.out.println("GST number is :'" + gstNumber + "' it is valid");
			 }
			 else {
				 System.err.println("GST number is :'" + gstNumber + "' it is invalid");
			 }
			 
			 if(bikeServiceCost>0) {
				 System.out.println("Bike service cost is :'" + bikeServiceCost + "' it is valid");
			 }
			 else {
				 System.err.println(" Bike service cost is :'" + bikeServiceCost+ "' it is invalid");
			 }
			 
			 if(specialization!=null && !specialization.isEmpty() && specialization.length()>3 && specialization.length()<100) {
					System.out.println("Specialization in is :'" + specialization + "' it is valid");
				}
				else {
					System.err.println("Specialization in is :'" + specialization + "' it is invalid");
				}

		}
		else {
			System.err.println("Input is null");
		}
		
	}
	

}
