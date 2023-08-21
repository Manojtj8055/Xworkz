package com.Xworkz.DTO;

import java.io.Serializable;

public class TheifDTO implements Serializable{

	private String specialization;
	private int experience;
	private int age;
	private String gangNmae;
	private int totalCase;
	public TheifDTO() {}
	
	public TheifDTO(String specialization, int experience, int age, String gangNmae, int totalCase) {
		
		this.specialization = specialization;
		this.experience = experience;
		this.age = age;
		this.gangNmae = gangNmae;
		this.totalCase = totalCase;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGangNmae() {
		return gangNmae;
	}

	public void setGangNmae(String gangNmae) {
		this.gangNmae = gangNmae;
	}

	public int getTotalCase() {
		return totalCase;
	}

	public void setTotalCase(int totalCase) {
		this.totalCase = totalCase;
	}

	@Override
	public String toString() {
		return "TheifDTO [specialization=" + specialization + ", experience=" + experience + ", age=" + age
				+ ", gangNmae=" + gangNmae + ", totalCase=" + totalCase + "]";
	}
	
	
}
