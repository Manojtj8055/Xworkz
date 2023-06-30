public class Bun {
    String name="Plane Bun";
    double quantity = 10;
    String shape;
    double price;
    Bun(){
        System.out.println("Bun const is running..");
    }
    public static void main(String[] args) {
        Bun bun = new Bun();
        System.out.println(bun.name);
        System.out.println(bun.quantity);
        System.out.println(bun.shape);
        System.out.println(bun.price);
    }
}