public class leet_3026 {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long maxSum = 0;
        
        // Create a map to store the sum for each value
        Map<Integer, Long> prefixSums = new HashMap<>();
        long currentSum = 0;
        
        for (int i = 0; i < n; i++) {
            currentSum += nums[i];
            
            // Check for nums[i] + k
            if (prefixSums.containsKey(nums[i] + k)) {
                maxSum = Math.max(maxSum, currentSum - prefixSums.get(nums[i] + k) + nums[i] + k);
            }
            
            // Check for nums[i] - k
            if (prefixSums.containsKey(nums[i] - k)) {
                maxSum = Math.max(maxSum, currentSum - prefixSums.get(nums[i] - k) + nums[i] - k);
            }
            
            // Store the minimum prefix sum for current value
            prefixSums.put(nums[i], Math.min(
                prefixSums.getOrDefault(nums[i], currentSum),
                currentSum
            ));
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        EqualSubstring solution = new EqualSubstring();
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 2;
        System.out.println("Maximum sum of good subarray: " + solution.maximumSubarraySum(nums, k));
    }
}
