public class Waffer {
    String name="Cream Waffer";
    double quantity = 1;
    String shape;
    int price;
    Waffer(){
        System.out.println("Waffer const is running..");
    }
    
    public static void main(String[] args) {
        Waffer waffer = new Waffer();
        System.out.println(waffer.name);
        System.out.println(waffer.quantity);
        System.out.println(waffer.shape);
        System.out.println(waffer.price);
    }
}