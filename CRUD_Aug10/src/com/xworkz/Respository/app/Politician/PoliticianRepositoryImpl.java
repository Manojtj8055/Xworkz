package com.xworkz.Respository.app.Politician;

public class PoliticianRepositoryImpl implements PoliticianRepository {

	String[] names=new String[TOTAL_NAMES];
	int index=0;
	
	
	
	
	
	
	@Override
	public void name(String name) {
		if(index<5) {
			this.names[index]=name;
			System.out.println("index  value of politician is " +name);
			System.out.println("");
			index=index+1;
			System.out.println("After update the index is "  + index);
		}
		else {
		
				System.out.println("no values can be added ");
			
		}
	}

	@Override
	public void display() {
		for(int Start=0;Start<5;Start++) {
			System.out.println("Name at index " + Start +""+ "  " +  names[Start]);
	}

}
}
