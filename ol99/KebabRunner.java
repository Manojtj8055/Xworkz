class KebabRunner{
	public static void main(String[] Kebabs){
		System.out.println("Running main...");

		Kebab ref1 = new Kebab();
				System.out.println("name : " +ref1.name);
				System.out.println("price : " +ref1.price);
				System.out.println("hotelName : " +ref1.hotelName);
				System.out.println("noOfPieces : " +ref1.noOfPieces);
				System.out.println("takeAway : " +ref1.takeAway);
						System.out.println("");

		Kebab ref2 = new Kebab("mutton kebab");
				System.out.println("name : " +ref2.name);
				System.out.println("price : " +ref2.price);
				System.out.println("hotelName : " +ref2.hotelName);
				System.out.println("noOfPieces : " + ref2.noOfPieces);
				System.out.println("takeAway : " +ref2.takeAway);
						System.out.println("");

		Kebab ref3 = new Kebab("fish Kebab" , 238.50, "UsamaHotel" );
				System.out.println("name : " +ref3.name);
				System.out.println("price : " +ref3.price);
				System.out.println("hotelName : " +ref3.hotelName);
				System.out.println("noOfPieces : " +ref3.noOfPieces);
				System.out.println("takeAway : " +ref3.takeAway);
						System.out.println("");

		Kebab ref4 = new Kebab("crab Kebab" , 402.3 , "SurajHotel" , 6 );
				System.out.println("name : " +ref4.name);
				System.out.println("price : " +ref4.price);
				System.out.println("hotelName : " +ref4.hotelName);
				System.out.println("noOfPieces : " +ref4.noOfPieces);
				System.out.println("takeAway : " +ref4.takeAway);
						System.out.println("");


		Kebab ref5 = new Kebab("golden Kebab" , 338.50, "ManojHotel" , 5 , true  );
				System.out.println("name : " +ref5.name);
				System.out.println("price : " +ref5.price);
				System.out.println("hotelName : " +ref5.hotelName);
				System.out.println("noOfPieces : " +ref5.noOfPieces);
				System.out.println("takeAway : " +ref5.takeAway);

	}
}