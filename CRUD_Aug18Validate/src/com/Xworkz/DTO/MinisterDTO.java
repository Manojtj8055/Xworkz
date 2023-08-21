package com.Xworkz.DTO;

import java.io.Serializable;

public class MinisterDTO implements Serializable {

	private String name;
	private int experience;
	private String designation;
	private String party;
	
	public MinisterDTO() {}
	
	public MinisterDTO(String name, int experience, String designation, String party) {
		
		this.name = name;
		this.experience = experience;
		this.designation = designation;
		this.party = party;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	@Override
	public String toString() {
		return "MinisterDTO [name=" + name + ", experience=" + experience + ", designation=" + designation + ", party="
				+ party + "]";
	}
	
	
	
	
}
