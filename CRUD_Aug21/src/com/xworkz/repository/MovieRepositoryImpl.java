package com.xworkz.repository;

import com.xworkz.DTO.MovieDto;

public class MovieRepositoryImpl implements MovieRepository{

	private MovieDto[] dtos=new MovieDto[TOTAL_LIMIT];
	int index=0;

	@Override
	public boolean validateAndSave(MovieDto dto) {
		if(index<TOTAL_LIMIT) {
			this.dtos[index]=dto;
			System.out.println(dto + "data is stored" + index);
			this.index++;
		}
		else {
			System.out.println("limit exceeded cannot store more values");
		}
		
		
		
		return false;
	}
}
