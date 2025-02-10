import java.util.Arrays;

public class Prefixsum2 {
    public static void main(String[] args) {  // Corrected method signature
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] prefixSum = new int[n];

        arr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        System.out.println("Prefix Sum: " + Arrays.toString(arr));
    }
}
