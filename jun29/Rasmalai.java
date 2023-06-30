class Sweet {
    String name="Rasmalai";
    double quantity = 1.5;
    double price;
    String color;

    Sweet(){
        System.out.println("Sweet const is running..");
    }

    public static void main(String[] args) {
        Sweet sweet1 = new Sweet();
        System.out.println(sweet1.name);
        System.out.println(sweet1.quantity);
        System.out.println(sweet1.price);
        System.out.println(sweet1.color);
    }
}