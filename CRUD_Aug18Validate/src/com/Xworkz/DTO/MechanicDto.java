package com.Xworkz.DTO;

import java.io.Serializable;

public class MechanicDto implements Serializable {

	private String garageName;
	private double Gstno;
	private String specialization;
	 private double bikeServiceCost;
	
	 public MechanicDto() {}
	 
	 public MechanicDto(String garageName, double gstno, String specialization, double bikeServiceCost) {
		
		this.garageName = garageName;
		this.Gstno = gstno;
		this.specialization = specialization;
		this.bikeServiceCost = bikeServiceCost;
	}
	public String getGarageName() {
		return garageName;
	}
	public void setGarageName(String garageName) {
		this.garageName = garageName;
	}
	public double getGstno() {
		return Gstno;
	}
	public void setGstno(double gstno) {
		this.Gstno = gstno;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public double getBikeServiceCost() {
		return bikeServiceCost;
	}
	public void setBikeServiceCost(double bikeServiceCost) {
		this.bikeServiceCost = bikeServiceCost;
	}
	@Override
	public String toString() {
		return "MechanicDto [garageName=" + garageName + ", gstno=" + Gstno + ", specialization=" + specialization
				+ ", bikeServiceCost=" + bikeServiceCost + "]";
	}
	
	 
	
	
}
