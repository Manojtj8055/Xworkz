package com.xworkz.diamond.Runner;

import com.xworkz.diamond.AlbumSongs;
import com.xworkz.diamond.FilmSongs;
import com.xworkz.diamond.KGF;
import com.xworkz.diamond.MusicDirector;

public class SongRunner {

	public static void main(String[] args) {

		
		System.out.println("A song Consists of following detail");
		System.out.println("");
		System.out.println("");
		FilmSongs filmSongs=new MusicDirector();
		filmSongs.Sound();
		filmSongs.Romatic();
		
		System.out.println("-------------------------------------------------");
		
		AlbumSongs albumSongs=new MusicDirector();
		albumSongs.Sound();
		albumSongs.HipHop();
		
		System.out.println("-------------------------------------------------");
		
		KGF kgf = new MusicDirector();
		kgf.MovieSongs();
		kgf.Romatic();
		kgf.HipHop();
		
		System.out.println("--------------------------------------------------");
		
		MusicDirector musicDirector=new MusicDirector();
		musicDirector.MovieSongs();
		musicDirector.Romatic();
		musicDirector.HipHop();
		musicDirector.Sound();
	
	}

}
