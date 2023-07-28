class Pot{
	String brand;
	double price;
	int capacity;
	String type;
	double weight;
	String shape;
	String level;
	int no ;
	
	Sofa(String brand,double price,int capacity,String type,double weight,String shape,String level,int no)
	{
		System.out.println("Contructor is running...");
		this.brand=brand;
		this.price=price;
		this.capacity=capacity;
		this.type=type;
		this.weight=weight;
		this.shape=shape;
		this.level=level;
		this.no=no;
	}
}