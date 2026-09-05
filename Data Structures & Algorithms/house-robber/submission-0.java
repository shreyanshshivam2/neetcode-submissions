class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        int []res = new int[n+2];
        res[0]=0;
         res[1]=0;

        for (int i =2;i<n+2;i++){

            res[i]= Math.max((res[i-2]+nums[i-2]),res[i-1]);

        }

        return res[n+1];



    }
}
