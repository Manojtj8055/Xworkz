import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] inputArray = {10, 45, 7, 9, 2};

        System.out.println("Original Array: " + Arrays.toString(inputArray));

        reverseArray(inputArray);

        System.out.println("Reversed Array: " + Arrays.toString(inputArray));
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
	  
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
