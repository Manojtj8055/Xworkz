package com.xworkz.dto;

public class AdressDTO {

	private Integer id;
	private Integer no;
	private String street;
	private String city;
	private String state;
	private Long pincode;
	public Integer getId() {
		return id;
	}
	public Integer getNo() {
		return no;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((no == null) ? 0 : no.hashCode());
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
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
		AdressDTO other = (AdressDTO) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (no == null) {
			if (other.no != null)
				return false;
		} else if (!no.equals(other.no))
			return false;
		if (pincode == null) {
			if (other.pincode != null)
				return false;
		} else if (!pincode.equals(other.pincode))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}
	public AdressDTO(Integer id, Integer no, String street, String city, String state, Long pincode) {
	
		this.id = id;
		this.no = no;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public AdressDTO() {
		
	}
	@Override
	public String toString() {
		return "AdressDTO [id=" + id + ", no=" + no + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	
	
	
	
}
