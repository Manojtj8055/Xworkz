package com.xworkz.runner;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.runner.personAndPassport.PassPortDTO;
import com.xworkz.runner.personAndPassport.PersonDTO;
import com.xworkz.runner.personAndPassport.Type;

public class PersonRunner {

	public static void main(String[] args) {
		
		 	PersonDTO personDTO=new PersonDTO(1, "Sachin", "sachin10@gmail.com", 8397265197l);
		 	PersonDTO personDTO1=new PersonDTO(2, "Abhishek", "abhi7@gmail.com", 8966265107l);
		 	PersonDTO personDTO2=new PersonDTO(3, "Anush", "anush8@gmail.com", 9872699289l);
		 	PersonDTO personDTO3=new PersonDTO(4, "Suhas", "suhas123@gmail.com", 9393725190l);
		 	PersonDTO personDTO4=new PersonDTO(5, "Harshith", "harshithg21@gmail.com", 6423432427l);
		 	PersonDTO personDTO5=new PersonDTO(6, "Madhura", "madhu66@gmail.com", 8397265197l);
		 	PersonDTO personDTO6=new PersonDTO(7, "Sanvi", "sanvi10@gmail.com", 7397226587l);
		 	PersonDTO personDTO7=new PersonDTO(8, "Harsha", "jojoharsh@gmail.com", 8243243297l);
	
		 	PassPortDTO passPortDTO=new PassPortDTO(1, 98374657l, LocalDate.of(2014, 3, 21), "India", LocalDate.of(2024, 3, 21), Type.DOMESTIC);
		 	PassPortDTO passPortDTO1=new PassPortDTO(2, 98374654l, LocalDate.of(2012, 4, 1), "England", LocalDate.of(2022, 4, 1), Type.INTERNATIONAL);
		 	PassPortDTO passPortDTO2=new PassPortDTO(3, 98374324l, LocalDate.of(2016, 11, 11), "India", LocalDate.of(2026, 11, 11), Type.DOMESTIC);
		 	PassPortDTO passPortDTO3=new PassPortDTO(4, 98377563l, LocalDate.of(2004, 1, 14), "Turkey", LocalDate.of(2014, 3, 14), Type.INTERNATIONAL);
		 	PassPortDTO passPortDTO4=new PassPortDTO(5, 98321455l, LocalDate.of(2022, 2, 15), "USA", LocalDate.of(2032, 3, 15), Type.INTERNATIONAL);
		 	PassPortDTO passPortDTO5=new PassPortDTO(6, 98374234l, LocalDate.of(2017, 3, 16), "Australia", LocalDate.of(2027, 3, 16), Type.INTERNATIONAL);
		 	PassPortDTO passPortDTO6=new PassPortDTO(7, 98374623l, LocalDate.of(2000, 4, 17), "Brazil", LocalDate.of(2010, 3, 17), Type.INTERNATIONAL);
		 	PassPortDTO passPortDTO7=new PassPortDTO(8, 98376644l, LocalDate.of(2014, 3, 20), "South Africa", LocalDate.of(2024, 3, 20), Type.INTERNATIONAL);
	
		 	Map<PersonDTO, PassPortDTO> verify=new HashMap<PersonDTO, PassPortDTO>();
		 	verify.put(personDTO7, passPortDTO7);
		 	verify.put(personDTO6, passPortDTO6);
		 	verify.put(personDTO5, passPortDTO5);
		 	verify.put(personDTO4, passPortDTO4);
		 	verify.put(personDTO3, passPortDTO3);
		 	verify.put(personDTO2, passPortDTO2);
		 	verify.put(personDTO1, passPortDTO1);
		 	verify.put(personDTO, passPortDTO);
		 	
		 	
		 	System.out.println("Collecting all PersonDTO");
		 	verify.keySet().stream()
		 	.collect(Collectors.toSet())
		 	.forEach(m->System.out.println(m));
		 	
		 	System.out.println(" ");
		 	
		 	System.out.println("Collecting all PasportDTO");
		 	verify.values().stream()
		 	.collect(Collectors.toSet())
		 	.forEach(n->System.out.println(n));
		 	
		 	System.out.println(" ");
		 	
		 	System.out.println("Collect all passport by type");
		 	verify.values().stream()
		 	.filter(f->f.getPassPort().equals(Type.INTERNATIONAL))
		 	.forEach(l->System.out.println(l));
		 	
		 	System.out.println(" ");
		 	
		 	System.out.println("Collect all passport by issueddate less than todays date and not expired");
	
		 	verify.values().stream()
		 	.filter(p->p.getIssuedDate().isBefore(LocalDate.now()) && p.getExpiryDate().isAfter(LocalDate.now()) )
		 	.collect(Collectors.toSet())
		 	.forEach(System.out::println);
	
		 	
		 	System.out.println("");
	
		 	
		 	System.out.println("Collect all expired PassPort");
	
		 	verify.values().stream()
		 	.filter(e->e.getExpiryDate().isBefore(LocalDate.now()))
		 	.collect(Collectors.toSet())
		 	.forEach(System.out::println);
		 	
		 	
		 	System.out.println(" ");
		 	
		 	System.out.println("Get person name");
		 	verify.keySet().stream()
		 	.filter(p->p.getName().equals("Sachin"))
		 	.collect(Collectors.toSet())
		 	.forEach(System.out::println);
	
		 	
		 	System.out.println("");
		 	
		 	System.out.println("Get by PassportNumber");
		 	verify.values().stream()
		 	.filter(po->po.getNo().equals(98374654l))
		 	.collect(Collectors.toSet())
		 	.forEach(System.out::println);
	}

}
