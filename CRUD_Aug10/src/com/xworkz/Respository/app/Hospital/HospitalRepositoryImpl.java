package com.xworkz.Respository.app.Hospital;

public class HospitalRepositoryImpl implements HospitalRepository {

	String[] names =new  String[TOTAL_HOSPITALS]; 
	int index=0;

	
	@Override
	public void name(String name) {

		if(index<TOTAL_HOSPITALS) {
			this.names[index]=name;
			System.out.println("Place of hospital in index form " + name);
			
			index=index+1;
			System.out.println("After update of the index value chnages to " + index);
			
		}
		else {
			System.err.println("end of entries");
		}
		
	
	}
	

	@Override
	public void display() {
		for(int Start=0;Start<TOTAL_HOSPITALS;Start++) {
			System.out.println("Name at index " + Start + " " + names[Start]);
	}	
	}
}
