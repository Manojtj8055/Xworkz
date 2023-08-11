package com.xworkz.Respository.app.Manga;

public class AnimeRespositoryImpl implements AnimeRepository{ 

	
	String[] names = new String[TOTAL_ITEMS];
	int index=0;
	
	@Override
	public void save(String name) {

		System.out.println("");
		System.out.println("invoking Anime Repository impl in AnimRepositry");
		if (index<TOTAL_ITEMS) {
			this.names[index]=name;
			System.out.println("index value of present index is :" +  name);
			index=index+1;
			System.out.println("updates index value is");
		}
		
		else {
			System.err.println("no values can be added");
		}
		
	}

	@Override
	public void display() {
		for( int Start=0;Start<TOTAL_ITEMS;Start++) {
			
			System.out.println();
			System.out.println("Name at index " + Start +" "+ names[Start]);
		}
		
	}
}
