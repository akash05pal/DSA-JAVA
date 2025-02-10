import java.util.Arrays;

public class SuffixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] suffixSum = new int[n];

        // Start from the last element
        suffixSum[n - 1] = arr[n - 1]; 

        // Compute suffix sum from right to left
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        }

        // Print the suffix sum array
        System.out.println("Suffix Sum: " + Arrays.toString(suffixSum));
    }
}
