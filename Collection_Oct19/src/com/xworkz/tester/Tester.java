package com.xworkz.tester;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.dto.AdressDTO;
import com.xworkz.dto.BrandDTO;
import com.xworkz.dto.ProductDTO;
import com.xworkz.dto.Type;

public class Tester {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		AdressDTO adressDTO1=new AdressDTO(1, 23," Lasvegas", "LOS-Angels", "USA", 738092l);
		AdressDTO adressDTO2=new AdressDTO(2, 43,"Dominic", "Tokyo", "China", 543592l);
		AdressDTO adressDTO3=new AdressDTO(3, 93,"Vinobnagar", "Shimoga", "Karnataka", 534392l);
		AdressDTO adressDTO4=new AdressDTO(4, 91,"Kashipur", "Bandra", "Mumbai", 530342l);
		AdressDTO adressDTO5=new AdressDTO(5, 434,"Jnn", "PB", "Delhi", 530942l);
		AdressDTO adressDTO6=new AdressDTO(6, 955,"Doubleroad", "Gulabs", "UP", 530692l);
		AdressDTO adressDTO7=new AdressDTO(7, 931,"Tagore", "Kuru", "MP", 530492l);
		AdressDTO adressDTO8=new AdressDTO(8, 193,"Chatterjestreet", "panji", "GOA", 530372l);
		AdressDTO adressDTO9=new AdressDTO(9, 933,"Guanhj", "Mohali", "Punjab", 530322l);
		AdressDTO adressDTO10=new AdressDTO(10, 593,"tihanuan", "Tahan", "Manipur", 530332l);
		
		BrandDTO brandDTO1=new BrandDTO(1, "IFB", "9836qd48hj", adressDTO1, 1995);
		BrandDTO brandDTO2=new BrandDTO(2, "TATA", "9736e2pp", adressDTO2, 1998);
		BrandDTO brandDTO3=new BrandDTO(3, "ASUS", "97332648pj", adressDTO3, 2008);
		BrandDTO brandDTO4=new BrandDTO(4, "lakme", "9736u23ih", adressDTO4, 2008);
		BrandDTO brandDTO5=new BrandDTO(5, "Loreal", "972328pj", adressDTO5, 2008);
		BrandDTO brandDTO6=new BrandDTO(6, "Highape", "9736444lj", adressDTO6, 2003);
		BrandDTO brandDTO7=new BrandDTO(7, "Wildcraft", "9323648hj", adressDTO7, 2010);
		BrandDTO brandDTO8=new BrandDTO(8, "IKEA", "973648oj", adressDTO8, 2015);
		BrandDTO brandDTO9=new BrandDTO(9, "ROYAL_OAK", "9736938hj", adressDTO9, 2017);
		BrandDTO brandDTO10=new BrandDTO(10, "DELL", "973643hj", adressDTO10, 2014);
		
		ProductDTO productDTO1=new ProductDTO(1, "Grinder", brandDTO1,3500, 1, Type.KITCHEN_APP);
		ProductDTO productDTO2=new ProductDTO(2, "Grinder", brandDTO2,3500, 4, Type.KITCHEN_APP);
		ProductDTO productDTO3=new ProductDTO(3, "Laptop", brandDTO3,35000, 2, Type.ELECTRONICS);
		ProductDTO productDTO4=new ProductDTO(4, "Cream", brandDTO4,500, 3, Type.BEAUTY);
		ProductDTO productDTO5=new ProductDTO(5, "Cream", brandDTO5,500, 5, Type.BEAUTY);
		ProductDTO productDTO6=new ProductDTO(6, "TrekkingBag", brandDTO6,2500, 1, Type.TRAVEL);
		ProductDTO productDTO7=new ProductDTO(7, "TrekkingBag", brandDTO7,1500, 1, Type.TRAVEL);
		ProductDTO productDTO8=new ProductDTO(8, "Sofa", brandDTO8,55000, 1, Type.FURNITURE);
		ProductDTO productDTO9=new ProductDTO(9, "Sofa", brandDTO9,31500, 1, Type.FURNITURE);
		ProductDTO productDTO10=new ProductDTO(10, "Laptop", brandDTO10,43500, 2, Type.ELECTRONICS);
		
		Collection<ProductDTO> collection= new HashSet<ProductDTO>();
		collection.add(productDTO1);
		collection.add(productDTO2);
		collection.add(productDTO3);
		collection.add(productDTO4);
		collection.add(productDTO5);
		collection.add(productDTO6);
		collection.add(productDTO7);
		collection.add(productDTO8);
		collection.add(productDTO9);
		collection.add(productDTO10);
		
		
		System.out.println(" ");
		
		
		System.out.println("Get all ProductDTO by pincode sort by desc");
		collection.stream().filter(p->p.getBrandDTO().getAdressDTO().getPincode().equals(530322l))
		.sorted()
		.collect(Collectors.toSet())
		.forEach(i->System.out.println(i));
		
		
		System.out.println("");
		
		System.out.println("Get all AdressDTO by product name sort by id desc/n");
		collection.stream().filter(a->a.equals(productDTO3))
		.map(q->q.getBrandDTO())
		.map(a1->a1.getAdressDTO())
		.collect(Collectors.toSet())
		.forEach(System.out::println);
		
		 
		System.out.println("");
		
		
		System.out.println("Get BrandDTO by ProductDTO");	
		collection.stream().filter(b->b.equals(productDTO8))
		.map(p->p.getBrandDTO())
		.collect(Collectors.toSet())
		.forEach(System.out::println);
		
		
		System.out.println(" ");
		
		System.out.println("Get adressDTO by brandDTO");
		collection.stream().filter(a2->a2.getBrandDTO().equals(brandDTO3))
		.map(m->m.getBrandDTO().getAdressDTO())
		.collect(Collectors.toSet())
		.forEach(System.out::println);
		
		System.out.println(" ");
		
		System.out.println("Get all ProductDTO by maxPrice");
		//Integer maxprice=35000;
		
		
		Optional<ProductDTO> op1=collection.stream().
		sorted((x,y)->y.getPrice().compareTo(x.getPrice()))
		.findFirst();
		
		System.out.println(op1);
		
	
		System.out.println(" ");
		
		System.out.println("Get all ProductDTO by Type,sort by id desc");
		collection.stream().filter(t->t.getType().equals(Type.KITCHEN_APP))
		.sorted((t1,t2)->Integer.compare(t2.getId(), t1.getId()))
		.forEach(System.out::println);
		
		
		System.out.println("");
		
		System.out.println("Get all ProductDTO sorted by quantity in desc order");
		collection.stream()
		.sorted((s1,s2)->s2.getQuantity().compareTo(s1.getQuantity()))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		
		
		
		//System.out.println("difference btw iterator and list iterator");
	}

}
