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

// optimal approach

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int left = 0;
        int right = nums.size() - 1;
        int count = 0;
        
        while(left < right) {
            if(nums.get(left) + nums.get(right) < target) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }
        
        return count;
    }
}
