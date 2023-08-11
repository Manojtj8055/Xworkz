package com.xworkz.Respository.app.Army;

public class ArmyRepositoryImpl implements ArmyRepository{

	
	String []names =new String[TOTAL_BATCH];
	int index=0;
	
	
	
	
	
	@Override
	public void save(String name) {
		if(index<TOTAL_BATCH) {
			this.names[index]=name;
			System.out.println("print index value " + name);


			index=index+1;
			System.out.println("print next index " + index);
		}
		else {
			System.out.println("no values added");
		}
		
	}

	@Override
	public void display() {
			for(int Start=0;Start<TOTAL_BATCH;Start++) {
				System.out.println("index values of " + names[Start]);
			}
		
	}

	
}
