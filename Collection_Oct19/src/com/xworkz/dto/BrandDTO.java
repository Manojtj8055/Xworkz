package com.xworkz.dto;

public class BrandDTO {

	private Integer id;
	private String name;
	private String gstNo;
	private AdressDTO adressDTO;
	private int estFrom;
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getGstNo() {
		return gstNo;
	}
	public AdressDTO getAdressDTO() {
		return adressDTO;
	}
	public int getEstFrom() {
		return estFrom;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	public void setAdressDTO(AdressDTO adressDTO) {
		this.adressDTO = adressDTO;
	}
	public void setEstFrom(int estFrom) {
		this.estFrom = estFrom;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adressDTO == null) ? 0 : adressDTO.hashCode());
		result = prime * result + ((gstNo == null) ? 0 : gstNo.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (adressDTO == null) {
			if (other.adressDTO != null)
				return false;
		} else if (!adressDTO.equals(other.adressDTO))
			return false;
		if (gstNo == null) {
			if (other.gstNo != null)
				return false;
		} else if (!gstNo.equals(other.gstNo))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public BrandDTO(Integer id, String name, String gstNo, AdressDTO adressDTO, int estFrom) {
		
		this.id = id;
		this.name = name;
		this.gstNo = gstNo;
		this.adressDTO = adressDTO;
		this.estFrom = estFrom;
	}
	
	public BrandDTO() {
		
	}
	@Override
	public String toString() {
		return "BrandDTO [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", adressDTO=" + adressDTO + ", estFrom="
				+ estFrom + "]";
	}
	
	
	
}
