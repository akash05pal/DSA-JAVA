class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenIndex = 0; // Pointer for even indices (0, 2, 4, ...)
        int oddIndex = 1;  // Pointer for odd indices (1, 3, 5, ...)

        while (evenIndex < nums.length && oddIndex < nums.length) {
            if (nums[evenIndex] % 2 == 1 && nums[oddIndex] % 2 == 0) {
                swap(nums, evenIndex, oddIndex);
            }
            
            if (nums[evenIndex] % 2 == 0) {
                evenIndex += 2;
            }

            if (nums[oddIndex] % 2 == 1) {
                oddIndex += 2;
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
