class Solution {
    public int[] findfirstandlastelement(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                first = mid;
                end = mid-1;
                
            }
            else if(nums[mid] > target){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }

        start = 0;
        end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                last = mid;
                start = mid+1;
                
            }
            else if(nums[mid] > target){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }

        int[] result = {first, last};

        return result;
    }
}