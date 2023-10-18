package com.xworkz.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MobileAndNameRunner {

	public static void main(String[] args) {
		
		
		Map<Long, String> map=new HashMap<Long, String>();
		map.put(7854522632l, "Harshith");
		map.put(9972632591l, "Manoj");
		map.put(7760483627l, "Randyor");
		map.put(7760335274l, "Bhavana");
		map.put(9900923050l, "Chetan");
		map.put(8105508914l, "Mallikarjun");
		map.put(7259824805l, "Rajiv");
		map.put(8884049490l, "Abhi");
		map.put(8364893027l, "Zoro");
		map.put(8537276540l, "Luffy");

//		for (String values : map.values()) {
//			if(values.length()>10) {
//				System.out.println(values);
//			}
		
		System.out.println("Names greater than 10 values");
		map.values().stream()
		.filter(g->g.length()>10)
		.forEach(o->System.out.println(o));
			
		System.out.println("");
		
		System.out.println("Name less than 10 values");
		map.values().stream()
		.filter(l->l.length()<10)
		.forEach(o1->System.out.println(o1));
	
		System.out.println("");
		
		System.out.println("Names all in UpperCase");
		map.values().stream()
		.forEach(u1->System.out.println(u1.toUpperCase()));
		
		System.out.println("");
		
		System.out.println("Collect all phone Numbers ending with 0");
		map.keySet().stream()
		.filter(e->e.toString().endsWith("0") )
		.collect(Collectors.toSet())
		.forEach(System.out::println);
		
		//% 10==0 another method 
		
		
		System.out.println("");
	
		System.out.println("Collect all phone numbers starting from 8");
		map.keySet().stream()
		.filter(s->s.toString().startsWith("8"))
		.collect(Collectors.toSet())
		.forEach(System.out::println);
	}
	
		
	}

                                  
