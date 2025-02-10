/*public class Prefixsum {
    
    public static void Prefixsum(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        System.out.println("Prefix Sum: " + Arrays.toString(prefixSum));
    }
}*/



import java.util.Arrays;

public class Prefixsum {
    public static void main(String[] args) {  // Corrected method signature
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] prefixSum = new int[n];

        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        System.out.println("Prefix Sum: " + Arrays.toString(prefixSum));
    }
}
