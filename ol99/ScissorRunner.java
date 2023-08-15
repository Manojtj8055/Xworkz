class ScissorRunner{
	public static void main(String[] Scissors){
		System.out.println("Running main...");

		Scissor ref1 = new Scissor();
				System.out.println("brand : " +ref1.brand);
				System.out.println("price : " +ref1.price);
				System.out.println("color : " +ref1.color);
				System.out.println("size : " +ref1.size);
				System.out.println("type : " +ref1.type);
				System.out.println("material : " +ref1.material);
				System.out.println("usage : " +ref1.usage);
						System.out.println("");

		Scissor ref2 = new Scissor(" amazonbasic ");
				System.out.println("brand : " +ref2.brand);
				System.out.println("price : " +ref2.price);
				System.out.println("color : " +ref2.color);
				System.out.println("size : " +ref2.size);
				System.out.println("type : " +ref2.type);
				System.out.println("material : " +ref2.material);
				System.out.println("usage : " +ref2.usage);
						System.out.println("");

		Scissor ref3 = new Scissor("Godrej" , "metal color", "Mayo Scissors" );
				System.out.println("brand : " +ref3.brand);
				System.out.println("price : " +ref3.price);
				System.out.println("color : " +ref3.color);
				System.out.println("size : " +ref3.size);
				System.out.println("type : " +ref3.type);
				System.out.println("material : " +ref3.material);
				System.out.println("usage : " +ref3.usage);
						System.out.println("");

		Scissor ref4 = new Scissor("Saya classic", "Iris Scissor" , "metal color" , 'm');
				System.out.println("brand : " +ref4.brand);
				System.out.println("price : " +ref4.price);
				System.out.println("color : " +ref4.color);
				System.out.println("size : " +ref4.size);
				System.out.println("type : " +ref4.type);
				System.out.println("material : " +ref4.material);
				System.out.println("usage : " +ref4.usage);
						System.out.println("");


		Scissor ref5 = new Scissor("Vishal office" ,"tenotomy scissor", "Metal color" 
									,'L',406.8);
				System.out.println("brand : " +ref5.brand);
				System.out.println("price : " +ref5.price);
				System.out.println("color : " +ref5.color);
				System.out.println("size : " +ref5.size);
				System.out.println("type : " +ref5.type);
				System.out.println("material : " +ref5.material);
				System.out.println("usage : " +ref5.usage);
						System.out.println("");


		Scissor ref6 = new Scissor("Munix" ,"bandage scissor", "metal color" , 	
									'L' , 206.3,"bandaging purpose"  );
				System.out.println("brand : " +ref6.brand);
				System.out.println("price : " +ref6.price);
				System.out.println("color : " +ref6.color);
				System.out.println("size : " +ref6.size);
				System.out.println("type : " +ref6.type);
				System.out.println("material : " +ref6.material);
				System.out.println("usage : " +ref6.usage);
						System.out.println("");

		Scissor ref7 = new Scissor("Manipal" ,"Surgical scissor", "Metal color" , 'm', 
									503.6,"Surgery purpose" , "metal made"   );
				System.out.println("brand : " +ref7.brand);
				System.out.println("price : " +ref7.price);
				System.out.println("color : " +ref7.color);
				System.out.println("size : " +ref7.size);
				System.out.println("type : " +ref7.type);
				System.out.println("material : " +ref7.material);
				System.out.println("usage : " +ref7.usage);


	}
}