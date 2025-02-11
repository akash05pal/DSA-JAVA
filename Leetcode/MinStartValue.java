import java.util.Scanner;
public class MinStartValue {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        
        // Calculate prefix sum array
        prefixSum[0] = nums[0];
        for(int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        
        // Find minimum prefix sum
        int minSum = prefixSum[0];
        for(int i = 0; i < n; i++) {
            minSum = Math.min(minSum, prefixSum[i]);
        }
        
        // If minimum sum is positive, we need startValue = 1
        // Otherwise, we need |minSum| + 1 as startValue
        return minSum >= 1 ? 1 : (-minSum + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        MinStartValue solution = new MinStartValue();
        System.out.println("Minimum start value needed: " + solution.minStartValue(nums));
        sc.close();
    }
}
