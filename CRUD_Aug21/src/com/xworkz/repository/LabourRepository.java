package com.xworkz.repository;

import com.xworkz.DTO.LabourDto;

public interface LabourRepository {

boolean validateAndSave(LabourDto dto);
	
	int TOTAL_LIMIT=5;
}
