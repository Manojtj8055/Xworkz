package com.xworkz.DTO;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HospitalDto implements Serializable{

	private String name;
	private int surgeons;
	private String location;
	private int totalPatients;
	
	
}
