package com.xworkz.runner.personAndPassport;

import java.time.LocalDate;

public class PassPortDTO {
	
	private Integer id;
	private Long no;
	private LocalDate issuedDate;
	private String issuedBy;
	private LocalDate expiryDate;
	private Type passPort;
	public Integer getId() {
		return id;
	}
	public Long getNo() {
		return no;
	}
	public LocalDate getIssuedDate() {
		return issuedDate;
	}
	public String getIssuedBy() {
		return issuedBy;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public Type getPassPort() {
		return passPort;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public void setPassPort(Type passPort) {
		this.passPort = passPort;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((passPort == null) ? 0 : passPort.hashCode());
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
		PassPortDTO other = (PassPortDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (passPort != other.passPort)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PassPortDTO [id=" + id + ", no=" + no + ", issuedDate=" + issuedDate + ", issuedBy=" + issuedBy
				+ ", expiryDate=" + expiryDate + ", passPort=" + passPort + "]";
	}
	public PassPortDTO(Integer id, Long no, LocalDate issuedDate, String issuedBy, LocalDate expiryDate,
			Type passPort) {
		
		this.id = id;
		this.no = no;
		this.issuedDate = issuedDate;
		this.issuedBy = issuedBy;
		this.expiryDate = expiryDate;
		this.passPort = passPort;
	}

	public PassPortDTO() {}
	
	
	
}
