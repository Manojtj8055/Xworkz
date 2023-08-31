package com.xworkz.repository.PM;

import com.xworkz.dto.PrimeMinisterDTO.PrimeMinisterDTO;

public interface PrimeMinisterRepository {

	int TOTAL_LIMIT=2;
	
	public void save(PrimeMinisterDTO dto);
	
	public PrimeMinisterDTO findByName(String name);
}
