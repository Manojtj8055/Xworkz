package com.xworkz.repository;

import com.xworkz.DTO.LabourDto;

public class LabourRepositoryImpl implements LabourRepository{

	private LabourDto[] dtos=new LabourDto[TOTAL_LIMIT];
	int index=0;
	
	@Override
	public boolean validateAndSave(LabourDto dto) {
		if (index<TOTAL_LIMIT) {
			this.dtos[index]=dto;
			System.out.println(dto + " data is stored at index "+ index);
			this.index++;
		}
		else {
			System.err.println("Limit exceeded cannot save more");
		}
		
		
		
		return false;
	}

}
