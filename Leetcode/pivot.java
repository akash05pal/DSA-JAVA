import java.util.Scanner;

class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        
        // Calculate prefix sum array
        prefixSum[0] = nums[0];
        for(int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        
        // Calculate total sum
        int totalSum = prefixSum[n-1];
        
        // Check each index
        for(int i = 0; i < n; i++) {
            int leftSum = (i > 0) ? prefixSum[i-1] : 0;
            int rightSum = totalSum - prefixSum[i];
            
            if(leftSum == rightSum) {
                return i;
            }
        }
        return -1;
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
        
        Solution solution = new Solution();
        System.out.println("Pivot Index: " + solution.pivotIndex(nums));
        sc.close();
    }
}
