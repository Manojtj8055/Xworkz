public class Bread {
    String name="Plane Bread";
    double quantity = 1;
    String shape = "rectangle";
    double price = 30.0;
    Bread(){
        System.out.println("Bread const is running..");
    }
    public static void main(String[] args) {
        Bread bread = new Bread();
        System.out.println(bread.name);
        System.out.println(bread.quantity);
        System.out.println(bread.shape);
        System.out.println(bread.price);
    }
	}