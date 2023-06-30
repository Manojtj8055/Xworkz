public class VegPuff {
    String name="Veg Puff";
    double quantity = 200;
    String shape;
    double price;
    VegPuff(){
        System.out.println("Veg Puff const in running..");
    }
    public static void main(String[] args) {
        VegPuff vegpuff = new VegPuff();
        System.out.println(vegpuff.name);
        System.out.println(vegpuff.quantity + " gm");
        System.out.println(vegpuff.shape);
        System.out.println(vegpuff.price);
    }
}