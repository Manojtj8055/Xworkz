package com.Xworkz.Runner;

import com.Xworkz.DTO.CEODto;
import com.Xworkz.DTO.Service.CEO.CeoService;
import com.Xworkz.DTO.Service.CEO.CeoServiceImpl;

public class CeoRunner {

	public static void main(String[] args) {
		System.out.println("runningh main in CeoRunner");
		
		CEODto dto=new CEODto("Elon Musk","SpaceEX",200000,21);
		
		CeoService ceoService=new CeoServiceImpl();
		ceoService.saveAndValidate(dto);
	}
}
