package com.xworkz.dto.PrimeMinisterDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class PrimeMinisterDTO {

	private int id;
	private String name;
	private String country;
	private String partyName;
}
