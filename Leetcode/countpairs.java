class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        int n = nums.size();  // Use size() for List
        
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {  // Start j from i+1 to avoid duplicates
                if(nums.get(i) + nums.get(j) < target) {  // Use get() for List
                    count++;
                }
            }
        }
        
        return count;
    }
}
