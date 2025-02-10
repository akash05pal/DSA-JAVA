import java.util.Arrays;
import java.util.Scanner;

public class Prefixsum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int[] prefixSum = new int[n];

        // Taking input for array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Computing prefix sum
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // Printing the prefix sum array
        System.out.println("Prefix Sum: " + Arrays.toString(prefixSum));

        scanner.close();
    }
}
