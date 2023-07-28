class Sofa{
	String brand;
	double price;
	int capacity;
	String type;
	double weight;
	double length;
	String madeof;
	double width;
	
	Sofa(String brand,double price,int capacity,String type,double weight,double length,String madeof,	double width)
	{
		System.out.println("Contructor is running...");
		this.brand=brand;
		this.price=price;
		this.capacity=capacity;
		this.type=type;
		this.weight=weight;
		this.length=length;
		this.madeof=madeof;
		this.width=width;
	}
}