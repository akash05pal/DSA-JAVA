import java.util.*;

public class CoolSubsequence {
    static List<Integer> findCoolSubsequence(int[] arr) {
        int n = arr.length;
        // Try each element as a single-element subsequence
        for(int i = 0; i < n; i++) {
            List<Integer> complement = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                if(j != i) {
                    complement.add(arr[j]);
                }
            }
            
            // Check if current element exists in complement
            if(complement.contains(arr[i])) {
                return Arrays.asList(arr[i]);
            }
        }
        return new ArrayList<>(); // No cool subsequence found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        List<Integer> result = findCoolSubsequence(arr);
        if(result.isEmpty()) {
            System.out.println("No cool subsequence exists");
        } else {
            System.out.println("Cool subsequence found: " + result);
        }
        sc.close();
    }
}
