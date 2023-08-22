package com.xworkz.service;

import com.xworkz.DTO.LabourDto;
import com.xworkz.service.util.validate.ValidateUtil;

public class LabourServiceImpl implements LabourService{

	@Override
	public boolean validateAndSave(LabourDto dto) {

		if(dto!=null) {
			String name=dto.getName();
			int age=dto.getAge();
			double salary=dto.getSalary();
			String work=dto.getWork();
			
			if(ValidateUtil.validateString(name)) {
				System.out.println("Labour name is : "+ name + " it is valid ");
			}
			else {
				System.err.println("Labour name is " + name + " and it is not valid");
			}
			
			if(ValidateUtil.validateNumber(age)) {
				System.out.println("Age of the labour is " + age + " age");
			}
			else {
				System.out.println("Age of the labour " +  age +" is not valid");
			}
			
			if(ValidateUtil.validateNumber(salary)) {
				System.out.println("Salary of the labour is : "+ salary);
			}else {
				System.err.println("Salary of the labour is invalid");
			}
			
			if(ValidateUtil.validateString(work) ) {
				System.out.println("Work type is :" + work);
			}else {
				System.err.println("Work of labour not valid");
			}
		}
		return true;
	}
}
