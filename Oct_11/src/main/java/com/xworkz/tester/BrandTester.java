package com.xworkz.tester;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.dto.Brand.BrandDTO;

public class BrandTester {

	public static void main(String[] args) {

		BrandDTO dto = new BrandDTO("Google", "Sundar Pichai", 200, "USA");
		BrandDTO dto1 = new BrandDTO("Fossil", "Tom Kartsotis ", 221, "USA");
		BrandDTO dto2 = new BrandDTO("Tesla", "Elon Musk", 8.14, "USA");
		BrandDTO dto3 = new BrandDTO("Redmi", "Rajendra Saraf", 13.2, "China");
		BrandDTO dto4 = new BrandDTO("Sonata", "Samir Dhir", 5.53, "India");
		BrandDTO dto5 = new BrandDTO("Infosys`", "Sundar Pichai", 200, "USA");
		BrandDTO dto6 = new BrandDTO("Lenovo", "Yang Yuanqing", 61.3, "China");
		BrandDTO dto7 = new BrandDTO("Puma", "Arne Freundt", 8.65, "Germany");
		BrandDTO dto8 = new BrandDTO("Dell", "Michael S Dell", 10.1, "USA");
		BrandDTO dto9 = new BrandDTO("TCS", "Ratan Tata", 27.1, "India");

		Collection<BrandDTO> brandDTOs = new HashSet<BrandDTO>();
		brandDTOs.add(dto9);
		brandDTOs.add(dto8);
		brandDTOs.add(dto7);
		brandDTOs.add(dto6);
		brandDTOs.add(dto5);
		brandDTOs.add(dto4);
		brandDTOs.add(dto3);
		brandDTOs.add(dto2);
		brandDTOs.add(dto1);
		brandDTOs.add(dto);

		
		System.out.println("Sorted DTO in reference of Name in Ascending order \n");
		brandDTOs.stream().sorted().forEach(v -> System.out.println(v));
		System.out.println("------------------------------------------------------------------------------------------------\n");
		
		System.out.println("Brand worth in billion is greater than 20 \n");
		brandDTOs.stream()
		.filter(rev->rev.getRevenueInBillions()>20)
		.forEach(rev->System.out.println(rev));
		
		
		System.out.println(" ");
		System.out.println("Brand worth in billion is lesser than 20 \n");
		brandDTOs.stream()
		.filter(rev->rev.getRevenueInBillions()<20)
		.forEach(rev->System.out.println(rev));
		

		System.out.println("--------------------------------------------------------------------------------------------------- ");
		System.out.println("Brand from USA \n");
		brandDTOs.stream()
		.filter(v -> v.getCountry().equals("USA"))
		.forEach(v -> System.out.println(v));

		System.out.println("");
		System.out.println("Brands other than USA \n");

		brandDTOs.stream()
		.filter(brand -> !"USA".equals(brand.getCountry()))
		.forEach(brand -> {
			System.out.println(brand);                                         // .forEach(System.out::println);
			});
	
		System.out.println("-----------------------------------------------------------------------------------------------------");
		
		System.out.println("All brands name starts with T \n");
		
		brandDTOs.stream()
		.filter(Start ->Start.getName().startsWith("T"))
		.forEach(Start->{
			System.out.println(Start);
		});
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		
		System.out.println("All owner name length is greater than 10 \n");
		
		brandDTOs.stream()
		.filter(l->l.getOwner().length()>10)
		.forEach(l->{
			System.out.println(l);
		});
		
		System.out.println(" ");
		System.out.println("All owner name length is lesser than 15 \n");
		
		brandDTOs.stream()
		.filter(l->l.getOwner().length()<15)
		.forEach(l->{
			System.out.println(l);
		});
		
	
	
	}

}
