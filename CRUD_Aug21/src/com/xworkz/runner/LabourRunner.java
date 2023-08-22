package com.xworkz.runner;

import com.xworkz.DTO.LabourDto;
import com.xworkz.service.LabourService;
import com.xworkz.service.LabourServiceImpl;

public class LabourRunner {

	public static void main(String[] args) {

		LabourDto dto1=new LabourDto("Madha","Carpenter",45,21000);
		LabourDto dto2=new LabourDto("Devappa","Mason",35,21090);
		
		
		LabourService labourService=new LabourServiceImpl();
		
		boolean result1=labourService.validateAndSave(dto1);
		
		if(result1) {
			System.out.println("Input being saved is : " + result1);
		}
		else {
			System.err.println("Input being saved is : " + result1);
		}
		
		System.err.println("---------------------------------------------");
		
		boolean result2=labourService.validateAndSave(dto2);
		
		if(result2) {
			System.out.println("Input being saved is : " + result2);
		}
		else {
			System.err.println("Input being saved is : " + result2);
		}

		
		
	}

}
