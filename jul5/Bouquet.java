import java.util.*;

public class Bouquet {
    private Map<String, Set<String>> bouquetMap;

    public Bouquet() {
        bouquetMap = new HashMap<>();
    }

    public void addFlower(String flower, String bouquet) {
        bouquetMap.putIfAbsent(bouquet, new HashSet<>());
        bouquetMap.get(bouquet).add(flower);
    }

    public String checkFlower(String flower) {
        for (Map.Entry<String, Set<String>> entry : bouquetMap.entrySet()) {
            if (entry.getValue().contains(flower)) {
                return entry.getKey();
            }
        }
        return "None";
    }

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower("Red Rose", "Bouquet1");
        bouquet.addFlower("White Rose", "Bouquet1");
        bouquet.addFlower("Yellow Rose", "Bouquet1");
        bouquet.addFlower("White Tulip", "Bouquet1");
        bouquet.addFlower("Purple Tulip", "Bouquet1");
        bouquet.addFlower("White Lily", "Bouquet1");
        bouquet.addFlower("Pink Rose", "Bouquet2");
        bouquet.addFlower("Orange Rose", "Bouquet2");
        bouquet.addFlower("Yellow Chrysanthemum", "Bouquet2");
        bouquet.addFlower("Orange Balsam", "Bouquet2");
		bouquet.addFlower("Pink Balsam", "Bouquet2");

        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();

        System.out.println(bouquet.checkFlower(flower));
    }
}