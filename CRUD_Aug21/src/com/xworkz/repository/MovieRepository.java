package com.xworkz.repository;

import com.xworkz.DTO.MovieDto;

public interface MovieRepository {


boolean validateAndSave(MovieDto dto);
	
	int TOTAL_LIMIT=5;
}
