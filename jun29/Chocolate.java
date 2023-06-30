public class Chocolate {
    String name="Nestle";
    double quantity = 10;
    String shape = "rectangle";
    double price = 100.0;
    
    Chocolate(){
        System.out.println("Chocolate const is running..");
    }
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate();
        System.out.println(chocolate.name);
        System.out.println(chocolate.quantity + " gm");
        System.out.println(chocolate.shape);
        System.out.println(chocolate.price);
    }
}