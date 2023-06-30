public class Cake {
    String name="Pastry";
    double price;
    double quantity = 1.5;
    String color;

    Cake(){
        System.out.println("Cake const is running..");
    }

    public static void main(String[] args) {
        Cake cake = new Cake();
        System.out.println(cake.name);
        System.out.println(cake.quantity + " kg");
        System.out.println(cake.price);
        System.out.println(cake.color);
    }
}