public class Sweet
{
	String Name="Mysore pak";
	double quantity=1;
	String shape="square";
	String colour="yellow";
	Sweet(){
		System.out.println("Sweet is awesome");
	}
	public static void main(String[]args)
	{
		Sweet sweet = new Sweet();
		System.out.println(sweet.Name);
		System.out.println(sweet.quantity + "kg");
		System.out.println(sweet.shape);
		System.out.println(sweet.colour);

	}
}