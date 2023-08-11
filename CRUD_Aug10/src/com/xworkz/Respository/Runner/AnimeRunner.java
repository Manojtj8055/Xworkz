package com.xworkz.Respository.Runner;

import com.xworkz.Respository.app.Manga.*;
//import com.xworkz.Respository.app.Manga.AnimeRespositoryImpl;

public class AnimeRunner {

	
	public static void main(String[] args) {
		
		System.out.println("Names at the index value is ");
		
		AnimeRepository repository=new AnimeRespositoryImpl();
		repository.save("Luffy");
		repository.save("Zoro");
		repository.save("Naruto");
		repository.save("Minato");
		repository.save("Manji");
		
		repository.display();
		
	}
}
