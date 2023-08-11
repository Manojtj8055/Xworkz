package com.xworkz.Respository.app.Apartment;

public class ApartmentRepositoryImpl implements ApartmentRepository{

	String[] names= new String[TOTAL_NAMES];
	int index=0;
	
	@Override
	public void save(String name) {
		System.out.println("");
		System.out.println("implementing in Apartment Repository");
		
		if(index<TOTAL_NAMES) {
			System.out.println(" Apartment name at this index " + name);
			this.names[index]=name;
			System.out.println("Updated index value is");
			index=index+1;
			System.out.println();
		}
		else {
			System.out.println("no values can be added further...");
		}
		
		
	}

	@Override
	public void display() {
		for(int Start=0;Start<TOTAL_NAMES;Start++) {
			System.out.println(names[Start]);
		}
	}

}
