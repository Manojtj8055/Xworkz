package com.xworkz.service;

import com.xworkz.DTO.MovieDto;
import com.xworkz.service.util.validate.ValidateUtil;

public class MovieServiceImpl implements MovieService{

	@Override
	public boolean validateAndSave(MovieDto dto) {

		String mName=dto.getMovieName();
		String hName=dto.getHeroName();
		String t=dto.getType();
		int nofh =dto.getNoOfHeroine();
		
		if(ValidateUtil.validateString(mName) ) {
			System.out.println("Movie name is "+ mName + " and it is valid and saved");
		}else {
			System.err.println("Movie name is "+ mName + " and it is not valid ");
		}
		
		if(ValidateUtil.validateString(hName) ) {
			System.out.println("Hero name is "+ hName + " and it is valid and saved");
		}else {
			System.err.println("Hero name is "+ hName + " and it is not valid ");
		}
		
		if(ValidateUtil.validateString(t) ) {
			System.out.println("Movie type is "+ t + " and it is valid and saved");
		}else {
			System.err.println("Movie type is "+ t + " and it is not valid ");
		}
		
		if(ValidateUtil.validateNumber(nofh)) {
			System.out.println("No of heroines in a movie is "+ nofh + " and value is valid");
		}
		else {
			System.out.println("No of heroines in a movie is "+ nofh + " and value is not valid");
		}
		return true;
	}

}
