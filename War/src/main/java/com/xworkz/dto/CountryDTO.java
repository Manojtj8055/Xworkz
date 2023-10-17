package com.xworkz.dto;

public class CountryDTO {

	private Integer id;
	private String Name;
	private PresidentDTO presidentDTO;
	private String continent;

	public CountryDTO() {
	}

	public CountryDTO(Integer id, String name, PresidentDTO presidentDTO, String continent) {

		this.id = id;
		this.Name = name;
		this.presidentDTO = presidentDTO;
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "CountryDTO [id=" + id + ", Name=" + Name + ", presidentDTO=" + presidentDTO + ", continent=" + continent
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public PresidentDTO getPresidentDTO() {
		return presidentDTO;
	}

	public void setPresidentDTO(PresidentDTO presidentDTO) {
		this.presidentDTO = presidentDTO;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((continent == null) ? 0 : continent.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((presidentDTO == null) ? 0 : presidentDTO.hashCode());
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
		CountryDTO other = (CountryDTO) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (continent == null) {
			if (other.continent != null)
				return false;
		} else if (!continent.equals(other.continent))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (presidentDTO == null) {
			if (other.presidentDTO != null)
				return false;
		} else if (!presidentDTO.equals(other.presidentDTO))
			return false;
		return true;
	}

}
