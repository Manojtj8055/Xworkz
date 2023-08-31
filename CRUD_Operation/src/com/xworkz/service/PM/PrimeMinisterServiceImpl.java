package com.xworkz.service.PM;

import com.xworkz.dto.PrimeMinisterDTO.PrimeMinisterDTO;
import com.xworkz.repository.PM.PrimeMinisterRepository;
import com.xworkz.util.validate.ValidateUtil;

public class PrimeMinisterServiceImpl implements PrimeMinisterService {
	
	private PrimeMinisterRepository primeMinisterRepository;
	public PrimeMinisterServiceImpl(PrimeMinisterRepository primeMinisterRepository) {
		this.primeMinisterRepository=primeMinisterRepository;
	}
	
	
	@Override
	public boolean validate(PrimeMinisterDTO dto) {
		if(dto!=null) {
			System.out.println("Value is not null can save");
			String name =dto.getName();
			String country=dto.getCountry();
			String partyName=dto.getPartyName();
			int id=dto.getId();
			
			
			if(ValidateUtil.validateString(name)) {
				System.out.println("PrimeMinister name " + name + " is a valid input");
			}
			else
			{
				System.err.println("PrimeMinister name " + name + " is a invalid input");
				return false;
			}
			
			if(ValidateUtil.validateString(country)) {
				System.out.println("PrimeMinister Country name " + country + " is a valid input");
			}
			else 
			{
				System.err.println("PrimeMinister Country name " + country + " is a invalid input");
			return false;
			}
			
			if(ValidateUtil.validateString(partyName)) {
				System.out.println("PrimeMinister Country name " + partyName + " is a valid input");
			}
			else
			{
				System.err.println("PrimeMinister Country name " + partyName + " is a invalid input");
				}
			if(ValidateUtil.validateNo(id)) {
				System.out.println("PrimeMinister ID is : " + id + " is a valid input ");
				}
			else
			{
				System.err.println("PrimeMinister ID is : " + id + " is a invalid input ");
			}
		}
		return false;
	}


	@Override
	public PrimeMinisterDTO findByName(String name) {
		if(ValidateUtil.validateString(name)) {
			System.out.println("Data is valid");
			return primeMinisterRepository.findByName(name);
		}
		System.err.println("Data is invalid");
		return null;
	}
}