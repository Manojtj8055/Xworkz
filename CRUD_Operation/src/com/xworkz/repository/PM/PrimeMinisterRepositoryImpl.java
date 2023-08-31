package com.xworkz.repository.PM;

import com.xworkz.dto.PrimeMinisterDTO.PrimeMinisterDTO;

public class PrimeMinisterRepositoryImpl implements PrimeMinisterRepository {

	private PrimeMinisterDTO[] dtos=new PrimeMinisterDTO[TOTAL_LIMIT];
	private int index=0;
	
	
	@Override
	public void save(PrimeMinisterDTO dto) {
		if(index<TOTAL_LIMIT) {
			this.dtos[index]=dto;
			System.out.println(dto + "Data is stored at index : " + index);
			this.index++;
		}
		else {
			System.err.println("Index limit reached " + index + " , cannot save more ");
		}
		
		
	}

	@Override
	public PrimeMinisterDTO findByName(String name) {
		for(int pos=0;pos<TOTAL_LIMIT;pos++) {
			if(dtos[pos].getName().equalsIgnoreCase(name)) {
				System.out.println("Data matched at index : " + index);
				System.out.println("Data is " +dtos[pos]);
				return dtos[pos];
			}else {
				System.err.println("Data not found ");
				
			}
		}
		return null;
		
	}
	

	
}
