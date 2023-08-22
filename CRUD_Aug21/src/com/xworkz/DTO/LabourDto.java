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
public class LabourDto implements Serializable {

	
	private String name;
	private String work;
	private int age;
	private double salary;
	
	
	
}
