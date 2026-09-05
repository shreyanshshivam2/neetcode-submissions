class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int now = 0, min = Integer.MAX_VALUE, l =0, r =0;


        for (r=0;r<nums.length;r++){
            now = now + nums[r];

            while (now>=target){
                
            min =  Math.min(r-l+1,min);
                now =  now-nums[l];
                l++;
            }

            }
        
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}