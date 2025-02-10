import java.util.Arrays;

class NumArray {
    private int[] prefixSum;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefixSum = new int[n];

        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
    }
    
    // Method to compute sum in a given range [left, right]
    public int sumRange(int left, int right) {
    if (left == 0) {
        return prefixSum[right];  // If starting from index 0, return directly
    } else {
        return prefixSum[right] - prefixSum[left - 1]; // Subtract prefix sum before left
    }
}


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        NumArray obj = new NumArray(nums);

        System.out.println(obj.sumRange(1, 3)); // Output: 9 (2+3+4)
        System.out.println(obj.sumRange(0, 2)); // Output: 6 (1+2+3)
    }
}
