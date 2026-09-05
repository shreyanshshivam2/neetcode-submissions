class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        if(n<=2){
            return n==1 ? nums[0]: Math.max(nums[0],nums[1]);
        }
        return Math.max(help(nums, 0, n-1), help(nums, 1, n));
    }

    private int help(int []nums, int l, int h){

        int prev1 = 0;
        int prev2 = 0;
        int curr = 0;
        for(int i =l;i<h;i++){
            curr =  Math.max(prev1, prev2+nums[i]);
            prev2 = prev1;
            prev1= curr;
        }

        return prev1;
    }
}
