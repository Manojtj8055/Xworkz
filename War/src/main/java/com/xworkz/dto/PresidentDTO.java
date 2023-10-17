package com.xworkz.dto;

import java.time.LocalDate;

public class PresidentDTO {

	private Integer id;
	private String name;
	private Integer age;
	private LocalDate durationStart;
	private LocalDate durationEnd;
	
	
	public PresidentDTO() {
		
	}
	
	public PresidentDTO(Integer id, String name, Integer age, LocalDate durationStart, LocalDate durationEnd) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.durationStart = durationStart;
		this.durationEnd = durationEnd;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public LocalDate getDurationStart() {
		return durationStart;
	}
	public void setDurationStart(LocalDate durationStart) {
		this.durationStart = durationStart;
	}
	public LocalDate getDurationEnd() {
		return durationEnd;
	}
	public void setDurationEnd(LocalDate durationEnd) {
		this.durationEnd = durationEnd;
	}
	
	@Override
	public String toString() {
		return "PresidentDTO [id=" + id + ", name=" + name + ", age=" + age + ", durationStart=" + durationStart
				+ ", durationEnd=" + durationEnd + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((durationEnd == null) ? 0 : durationEnd.hashCode());
		result = prime * result + ((durationStart == null) ? 0 : durationStart.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		PresidentDTO other = (PresidentDTO) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (durationEnd == null) {
			if (other.durationEnd != null)
				return false;
		} else if (!durationEnd.equals(other.durationEnd))
			return false;
		if (durationStart == null) {
			if (other.durationStart != null)
				return false;
		} else if (!durationStart.equals(other.durationStart))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
