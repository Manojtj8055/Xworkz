public class Candy {
    String name="Candy";
    double quantity = 10;
    String shape = "round";
    double price = 10.0;
    Candy(){
        System.out.println("Candy const is running..");
    }
    public static void main(String[] args) {
        Candy candy = new Candy();
        System.out.println(candy.name);
        System.out.println(candy.quantity + " gm");
        System.out.println(candy.shape);
        System.out.println(candy.price);
    }
}