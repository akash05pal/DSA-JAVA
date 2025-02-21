class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int left = 0;
        int right =nums.length -1;
        int n= nums.length;
        long result=0;

        while(left<=right){
                if(left == right){
                    result+= nums[left];
                }
                else{
                    result+= Long.parseLong( nums[left] + "" + nums[right]);
                }
                left++;
                right --;
        }
        return result;
    }
}