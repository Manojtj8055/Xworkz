package com.xworkz.Respository.app.Olympic;

public class OlympicRepositoryImpl implements OlympicRepository{

	String[] year=new String[TOTAL_YEAR];
	int index=0;
	
	
	@Override
	public void year(String year) {
		
		if(index<TOTAL_YEAR) {
		this.year[index]=year;
			System.out.println("Year of Olympic starts" + year);
			
			index=index+1;
			System.out.println("year of olympic after update");
		}
		else {
			System.err.println("entries are full");
		}
	}

	@Override
	public void display() {
		for(int Start=0;Start<5;Start++) {
			System.out.println("All the places where olympics held in order "+ "" +Start+" is " + year[Start]);
			
		}
		
	}
	
}