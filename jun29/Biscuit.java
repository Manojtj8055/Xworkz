public class Biscuit {
    String name="Marie gold";
    double quantity = 300;
    String shape= "oval";
    String color;
    Biscuit(){
        System.out.println("Biscuit  is tasty");
    }
    public static void main(String[] args) {
        Biscuit biscuit = new Biscuit();
        System.out.println(biscuit.name);
        System.out.println(biscuit.quantity + " gm");
        System.out.println(biscuit.shape);
        System.out.println(biscuit.color);
    }
    
}