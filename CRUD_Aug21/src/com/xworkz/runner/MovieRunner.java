package com.xworkz.runner;

import com.xworkz.DTO.MovieDto;
import com.xworkz.service.MovieService;
import com.xworkz.service.MovieServiceImpl;

public class MovieRunner {

	public static void main(String[] args) {

		
		MovieDto dto1=new MovieDto("Jailer", "Rajnikanth", "Mass", 3);
		MovieDto dto2=new MovieDto("KGF", "Yash", "Mass", 2);
		MovieDto dto3=new MovieDto("RRR", "Ramcharan", "Mass", 5);
		MovieDto dto4=new MovieDto("VR", "Sudeep", "Mass", 4);
		
		MovieService movieService=new MovieServiceImpl();
		
		boolean result1=movieService.validateAndSave(dto1);
		if(result1) {
			System.out.println("Input is being saved is: " + result1);
		}
		else {
			System.out.println("Input is being saved is: " + result1);
		}
		
		System.err.println("---------------------------------------------");
		
		boolean result2=movieService.validateAndSave(dto2);
		if(result2) {
			System.out.println("Input is being saved is: " + result2);
		}
		else {
			System.out.println("Input is being saved is: " + result2);
		}
		
		System.err.println("---------------------------------------------");
		
		
		boolean result3=movieService.validateAndSave(dto3);
		if(result3) {
			System.out.println("Input is being saved is: " + result3);
		}
		else {
			System.out.println("Input is being saved is: " + result3);
		}
		
		System.err.println("---------------------------------------------");
		
		boolean result4=movieService.validateAndSave(dto4);
		if(result1) {
			System.out.println("Input is being saved is: " + result4);
		}
		else {
			System.out.println("Input is being saved is: " + result4);
		}
		
		System.err.println("---------------------------------------------");
		
		
		
	}

}
