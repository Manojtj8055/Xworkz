package com.xworkz.diamond.Runner;

import com.xworkz.diamond.Luffy;
import com.xworkz.diamond.Pirates;
import com.xworkz.diamond.Sea;
import com.xworkz.diamond.StrawHatPirates;
import com.xworkz.diamond.Zoro;

public class PirateRunner {

	public static void main(String[] args) {
		
		Sea sea=new StrawHatPirates();
		sea.Sail();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^6^^");
		
		Luffy luffy=new StrawHatPirates();
		luffy.GumoGumo();
		luffy.Sail();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		Zoro zoro=new StrawHatPirates();
		zoro.SwordsMan();
		zoro.Sail();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Pirates pirates =new StrawHatPirates();
		pirates.Sail();
		pirates.OnePiece();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		StrawHatPirates strawHatPirates = new StrawHatPirates();
		strawHatPirates.Sail();
		strawHatPirates.GumoGumo();
		strawHatPirates.SwordsMan();
		strawHatPirates.OnePiece();
	}

}
