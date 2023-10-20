package com.xworkz.dto;

public class ProductDTO {

	private Integer id ;
	private String name;
	private BrandDTO brandDTO;
	private Integer price;
	private Integer quantity;
	private Type type;
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public BrandDTO getBrandDTO() {
		return brandDTO;
	}
	public Integer getPrice() {
		return price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public Type getType() {
		return type;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBrandDTO(BrandDTO brandDTO) {
		this.brandDTO = brandDTO;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public void setType(Type type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandDTO == null) ? 0 : brandDTO.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		ProductDTO other = (ProductDTO) obj;
		if (brandDTO == null) {
			if (other.brandDTO != null)
				return false;
		} else if (!brandDTO.equals(other.brandDTO))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	public ProductDTO(Integer id, String name, BrandDTO brandDTO, Integer price, Integer quantity, Type type) {
		
		this.id = id;
		this.name = name;
		this.brandDTO = brandDTO;
		this.price = price;
		this.quantity = quantity;
		this.type = type;
	}
	public ProductDTO() {
		
	}
	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", brandDTO=" + brandDTO + ", price=" + price + ", quantity="
				+ quantity + ", type=" + type + "]";
	}
	
	
}
