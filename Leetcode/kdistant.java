class Solution {
    public int[] findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        int[] temp = new int[n];
        int count = 0;
        
        // Mark valid indices in temp array
        for(int i = 0; i < n; i++) {
            for(int j = Math.max(0, i-k); j <= Math.min(n-1, i+k); j++) {
                if(nums[j] == key) {
                    temp[count++] = i;
                    break;
                }
            }
        }
        
        // Create result array of exact size
        int[] result = new int[count];
        for(int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        
        return result;
    }
}
