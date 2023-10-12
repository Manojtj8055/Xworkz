package com.xworkz.dto.Brand;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class BrandDTO implements Comparable<BrandDTO> {

	private String Name;
	private String Owner;
	private double revenueInBillions;
	private String Country;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}

	public double getRevenueInBillions() {
		return revenueInBillions;
	}

	public void setRevenueInBillions(double revenueInBillions) {
		this.revenueInBillions = revenueInBillions;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public BrandDTO() {

	}

	public BrandDTO(String name, String owner, double revenueInBillions, String country) {

		this.Name = name;
		this.Owner = owner;
		this.revenueInBillions = revenueInBillions;
		this.Country = country;
		
	}

	@Override
	public String toString() {
		return "BrandDTO [Name=" + Name + ", Owner=" + Owner + ", revenueInBillions=" + revenueInBillions + ", Country="
				+ Country + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Country == null) ? 0 : Country.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BrandDTO other = (BrandDTO) obj;
		if (Country == null) {
			if (other.Country != null)
				return false;
		} else if (!Country.equals(other.Country))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}

	@Override
	public int compareTo(BrandDTO args) {
		BrandDTO temp=this;
		return temp.getName().compareTo(args.getName());
	}

}
