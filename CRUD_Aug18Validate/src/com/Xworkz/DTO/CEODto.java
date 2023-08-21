package com.Xworkz.DTO;

import java.io.Serializable;

public class CEODto implements Serializable {

	private String name;
	private String companyName;
	private int salary;
	private int experience;
	
	
	public CEODto() {}
	
	
	public CEODto(String name, String companyName, int salary, int experience) {
		
		this.name = name;
		this.companyName = companyName;
		this.salary = salary;
		this.experience = experience;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	@Override
	public String toString() {
		return "CEODto [name=" + name + ", companyName=" + companyName + ", salary=" + salary + ", experience="
				+ experience + "]";
	}
	
	
	
}
