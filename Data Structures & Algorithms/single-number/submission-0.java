class Solution {
    public int singleNumber(int[] nums) {
        int val = 0;
        for(int n:nums){
            val^=n;
        }
        return val;
    }
}