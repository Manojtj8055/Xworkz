package com.xworkz.tester;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.dto.CountryDTO;
import com.xworkz.dto.PresidentDTO;
import com.xworkz.dto.WarDTO;

public class PresidentRunner {

	public static void main(String[] args) {
		// 1st war
		PresidentDTO presidentDTO1 = new PresidentDTO(1, "Kim II -sung", 42, LocalDate.of(1948, 6, 26),
				LocalDate.of(1994, 7, 23));
		PresidentDTO presidentDTO2 = new PresidentDTO(2, "Syngman Rhee", 52, LocalDate.of(1947, 9, 6),
				LocalDate.of(1960, 7, 23));

		CountryDTO countryDTO1 = new CountryDTO(1, "North Korea", presidentDTO1, "Asia");
		CountryDTO countryDTO2 = new CountryDTO(2, "South Korea", presidentDTO2, "Asia");

		Collection<CountryDTO> country1 = new HashSet<CountryDTO>();
		country1.add(countryDTO1);
		country1.add(countryDTO2);

		WarDTO warDTO = new WarDTO(1, LocalDate.of(1950, 6, 25), LocalDate.of(1953, 7, 27), country1, "South Korea");

		// 2nd war
		PresidentDTO presidentDTO3 = new PresidentDTO(1, "Ho Chi Minh", 85, LocalDate.of(1945, 12, 5),
				LocalDate.of(1969, 12, 25));
		PresidentDTO presidentDTO4 = new PresidentDTO(2, "Ngo Dinh Diem", 65, LocalDate.of(1955, 1, 5),
				LocalDate.of(1963, 6, 25));

		CountryDTO countryDTO3 = new CountryDTO(1, "North Vietnam", presidentDTO3, "Asia");
		CountryDTO countryDTO4 = new CountryDTO(2, "South Vietnam", presidentDTO4, "Asia");

		Collection<CountryDTO> country2 = new HashSet<CountryDTO>();
		country2.add(countryDTO3);
		country2.add(countryDTO4);

		WarDTO warDTO2 = new WarDTO(2, LocalDate.of(1955, 9, 1), LocalDate.of(1955, 4, 30), country2, "North Vietnam");

		PresidentDTO presidentDTO5 = new PresidentDTO(1, "George H.W. Bush", 66, LocalDate.of(1989, 3, 2),
				LocalDate.of(1993, 12, 28));
		PresidentDTO presidentDTO6 = new PresidentDTO(2, "Saddam Hussein", 53, LocalDate.of(1979, 3, 24),
				LocalDate.of(2006, 11, 18));

		CountryDTO countryDTO5 = new CountryDTO(1, "Iraq", presidentDTO5, "Asia");
		CountryDTO countryDTO6 = new CountryDTO(2, "USA", presidentDTO6, "North America");

		Collection<CountryDTO> country3 = new HashSet<CountryDTO>();
		country3.add(countryDTO5);
		country3.add(countryDTO6);

		WarDTO warDTO3 = new WarDTO(3, LocalDate.of(1990, 8, 2), LocalDate.of(1991, 2, 28), country3, "USA");

		PresidentDTO presidentDTO7 = new PresidentDTO(1, "Indira Gandhi", 54, LocalDate.of(1966, 2, 24),
				LocalDate.of(1977, 12, 16));
		PresidentDTO presidentDTO8 = new PresidentDTO(2, "Agha Muhammad Yahya Khan", 54, LocalDate.of(1969, 8, 14),
				LocalDate.of(1971, 2, 16));

		CountryDTO countryDTO7 = new CountryDTO(1, "India", presidentDTO7, "Asia");
		CountryDTO countryDTO8 = new CountryDTO(2, "Pakistan", presidentDTO8, "Asia");

		Collection<CountryDTO> country4 = new HashSet<CountryDTO>();
		country4.add(countryDTO7);
		country4.add(countryDTO8);

		WarDTO warDTO4 = new WarDTO(4, LocalDate.of(1971, 12, 3), LocalDate.of(1971, 12, 16), country4, "India");

		Collection<WarDTO> collection = new HashSet<WarDTO>();
		collection.add(warDTO);
		collection.add(warDTO2);
		collection.add(warDTO3);
		collection.add(warDTO4);

		presidentByCountry(collection, "Pakistan");
		byDate(collection, LocalDate.of(1971, 12, 3), LocalDate.of(1971, 12, 16));
		
System.out.println("");		
		// collect all president and print
		collection.stream().flatMap(pr -> pr.getCountryDTO().stream()).map(m -> m.getPresidentDTO().getName())
				.collect(Collectors.toList()).forEach(f -> System.out.println("All the presidents from wars : " + f));
		System.out.println("");

		// collect all countries

		System.out.println("Collect all countries");
		collection.stream().flatMap(c1 -> c1.getCountryDTO().stream()).map(s -> s.getName())
				.collect(Collectors.toList()).forEach(l -> System.out.println(l));

		System.out.println("");

//		collect all start date and end date
		collection.stream().filter(d -> d.getStartDate().equals(d) && d.getEndDate().equals(d))
				.collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("");

		// collect all by continent
		System.out.println("Collect all continent");
		collection.stream().flatMap(r -> r.getCountryDTO().stream()).map(d -> d.getContinent())
				.collect(Collectors.toSet()).forEach(x -> System.out.println(x));

	}

	private static void byDate(Collection<WarDTO> collection, LocalDate of, LocalDate of2) {
		Set<WarDTO> data=collection.stream()
				.filter(d->d.getStartDate().equals(of)&& d.getEndDate().equals(of2))
				.collect(Collectors.toSet());
		
		System.out.println("The date between " + of + " and " + of2);
		data.forEach(i->System.out.println(i));
		
	}

	public static void presidentByCountry(Collection<WarDTO> collection, String countryName) {
		List<String> president = collection.stream().flatMap(war -> war.getCountryDTO().stream())
				.filter(country -> country.getName().equals(countryName)).map(pres -> pres.getPresidentDTO().getName())
				.collect(Collectors.toList());

		president.forEach(ref -> System.out.println("The President from " + countryName + " is " + ref));
		System.out.println("");
	}
	
}