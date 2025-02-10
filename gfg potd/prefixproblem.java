import java.util.Arrays;
import java.util.Scanner;

public class prefixproblem {
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

        // Taking input for number of queries
        System.out.print("Enter the number of queries: ");
        int q = scanner.nextInt();

        System.out.println("Enter the queries (l r):");
        while (q-- > 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
        
            // Convert 1-based index to 0-based
            l--;
            r--;
        
            // Compute the sum using prefix sum array
            int sum;
            if (l > 0) {
                sum = prefixSum[r] - prefixSum[l - 1];
            } else {
                sum = prefixSum[r];
            }
        
            // Output the result
            System.out.println(sum);
        }
        

        scanner.close();
    }
}
