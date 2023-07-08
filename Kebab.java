class Kebab{
	String name = "Chicken kebab" ;
	double price ;
	String hotelName = "Bright Hotel";
	int noOfPieces;
	boolean takeAway;

	Kebab(){
		System.out.println("Constructor 1 is running with 0 parameters... :");
	}

	Kebab(String name){
		System.out.println("Constructor 2 is running with String parameter... :");
		this.name = name;
	}

	Kebab(String name ,double price ,String hotelName){
		System.out.println("Constructor 3 is running with string,double,string parameters... :");
		this.name = name;
		this.price = price;
		this.hotelName = hotelName;
	}

	Kebab(String name ,double price ,String hotelName ,int noOfPieces){
		System.out.println("Constructor 4 is running with string,double,string,int parameters... :");
		this.name = name;
		this.price = price;
		this.hotelName = hotelName;
		this.noOfPieces = noOfPieces;
	}

	Kebab(String name ,double price ,String hotelName ,int noOfPieces ,boolean takeAway){
		System.out.println("Constructor 5 is running with string,double,string,int parameters... :");
		this.name = name;
		this.price = price;
		this.hotelName = hotelName;
		this.noOfPieces = noOfPieces;
		this.takeAway = takeAway;
	}
}