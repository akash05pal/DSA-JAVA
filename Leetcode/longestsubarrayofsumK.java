class Solution {
    public int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int currSum = 0;
        int maxSubarrLen = 0;
        Map<Integer, Integer> prefixSum = new HashMap<>();
        
        prefixSum.put(0, -1);
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            
            if (prefixSum.containsKey(currSum - k)) {
                maxSubarrLen = Math.max(maxSubarrLen, i - prefixSum.get(currSum - k));
            }
            
            if (!prefixSum.containsKey(currSum)) {
                prefixSum.put(currSum, i);
            }
        }

        return maxSubarrLen;
    }
}

given integer k and dynamic array with not knowing length of it, 
and an array of size k , the task is to find the k largest element and store in it

example: arr={9,7,2,-1,0,8,....} and k =3
output: {9,8,7} 