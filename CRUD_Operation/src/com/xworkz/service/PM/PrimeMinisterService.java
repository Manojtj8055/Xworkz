package com.xworkz.service.PM;

import com.xworkz.dto.PrimeMinisterDTO.PrimeMinisterDTO;

public interface PrimeMinisterService {

	public boolean validate(PrimeMinisterDTO dto);
	
	public PrimeMinisterDTO findByName(String name);
	
}
