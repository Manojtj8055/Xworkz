class Scissor{
	String brand = "Nataraj" ;
	String color = "blue";
	String type ;
	String usage ;
	char size;
	double price;
	String material = "steel made ";

	Scissor(){
		System.out.println("Constructor 1 is running with 0 parameters... :");
	}

	Scissor(String brand){
		System.out.println("Constructor 2 is running with String parameter... :");
		this.brand = brand;
	}

	Scissor(String brand ,String color ,String type){
		System.out.println("Constructor 3 is running with string,String,string parameters... :");
		this.brand = brand;
		this.color = color;
		this.type = type;
	}

	Scissor(String brand ,String type ,String color ,char size){
		System.out.println("Constructor 4 is running with string,String,string,char parameters... :");
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.size = size;
	}


	Scissor(String brand ,String type ,String color ,char size ,double price){
		System.out.println("Constructor 5 is running with string,String,string,char,double parameters... :");
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.size = size;
		this.price = price;
	}


	Scissor(String brand ,String type ,String color ,char size , double price,String usage){
		System.out.println("Constructor 6 is running with string,String,string,char,"+
							"double,string, parameters... :");
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.size = size;
		this.price = price;
		this.usage = usage;
	}

	Scissor(String brand ,String type ,String color ,char size , double price ,
			String usage ,String material){
		System.out.println("Constructor 7 is running with string,String,string,"+
							"char,double,string,string parameters... :");
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.size = size;
		this.price = price;
		this.usage = usage;
		this.material = material;
	}
}	