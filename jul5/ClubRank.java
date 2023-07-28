import java.util.Arrays;

public class ClubRank {
    public static void main(String[] args) {
        int[] ranks = {20, 5, 28, 67, 44};
        int harperRank = 34; 

        int[] updatedRanks = new int[ranks.length + 1];
        System.arraycopy(ranks, 0, updatedRanks, 0, ranks.length);
        updatedRanks[updatedRanks.length - 1] = harperRank;

        Arrays.sort(updatedRanks);
        int harperPosition = updatedRanks.length - Arrays.binarySearch(updatedRanks, harperRank);

        System.out.println("Harper's rank: " + harperPosition);
    }
}