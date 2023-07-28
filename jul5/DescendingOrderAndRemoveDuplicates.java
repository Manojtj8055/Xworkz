import java.util.Arrays;
import java.util.HashSet;

public class DescendingOrderAndRemoveDuplicates {
    public static void main(String[] args) {
        int[] inputArray = {2, 5, 4, 8, 2, 3, 6, 2};

        System.out.println("Original Array: " + Arrays.toString(inputArray));

        int[] sortedArray = arrangeInDescendingOrder(inputArray);
        int[] uniqueArray = removeDuplicates(sortedArray);

        System.out.println("Sorted Array in Descending Order with Duplicates Removed: " + Arrays.toString(uniqueArray));
    }

    public static int[] arrangeInDescendingOrder(int[] arr) {
        Arrays.sort(arr);  

        int[] descendingArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            descendingArray[i] = arr[arr.length - 1 - i];
        }

        return descendingArray;
    }

    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int[] uniqueArray = new int[set.size()];

        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }
}
