 package com.Xworkz.DTO;

import java.io.Serializable;

public class CookDTO implements Serializable {

	
	private String specialItem;
	private String hotelName;
	private String Gender;
	private int salary;
	
	
	public CookDTO() {
		
	}
	
	
	public CookDTO(String specialItem, String hotelName, String gender, int salary) {
		super();
		this.specialItem = specialItem;
		this.hotelName = hotelName;
		this.Gender = gender;
		this.salary = salary;
	}
	
	
	
	public String getSpecialItem() {
		return specialItem;
	}
	public void setSpecialItem(String specialItem) {
		this.specialItem = specialItem;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		hotelName = hotelName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "CookDTO [specialItem=" + specialItem + ", HotelName=" + hotelName + ", Gender=" + Gender + ", salary="
				+ salary + "]";
	}
	
	
}
