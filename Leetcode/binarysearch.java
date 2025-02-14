class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                return i; // Return index as soon as target is found
            }
        }
        return -1; // Return -1 if target is not found
    }
}
