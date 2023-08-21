package com.Xworkz.DTO.Service.CEO;

import com.Xworkz.DTO.CEODto;

public class CeoServiceImpl implements CeoService{

	@Override
	public void saveAndValidate(CEODto dto) {
		if(dto != null) {
			String name =dto.getName();
			String companyName=dto.getCompanyName();
			int salary =dto.getSalary();
			int experience=dto.getExperience();
			
			if(name!=null && !name.isEmpty() && name.length() >3 && name.length() <30) {
				System.out.println("Ceo name is : " + name + " it is valid");
			}
			else {
				System.err.println("Ceo name is : "+ name + " it is invalid");
			}

			if(companyName!=null && !companyName.isEmpty() && companyName.length() > 3 && companyName.length() <30) {
				System.out.println("Company name is : '" + companyName + "' it is valid");
			}
			else {
				System.err.println("Company name is : '" + companyName + "' it is invalid");
			}
			
			if(salary>0) {
				System.out.println("Salary is :'" + salary + "' it is valid");
			}
			else {
				System.err.println("Salary is :'" + salary + "' it is invalid");
			}
			
			if(experience>0 && experience < 150) {
				System.out.println("Experience is :'" + experience + "' it is valid");
			}
			else {
				System.err.println("Experience is :'" + experience + "' it is invalid");
			}

		}
		else {
			System.err.println("Input is null");
		}
		
		}
		
	}


