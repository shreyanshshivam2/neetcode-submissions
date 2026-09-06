class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        /*
            S2 - S1 = T
            S2 = T+S1
            S1+S2 = TS
            S1+S1+T =TS
            S1 = (TS-T)/2
        */


        int ts = 0, n = nums.length;

        for(int num : nums){
            ts+=num;
        }


        if ((ts-target)%2==1)
        return 0;

        if (target>ts)
        return 0;

        int ss= (Math.abs(ts-target))/2;

        int [][] dp =  new int[n+1][ss+1];

        dp[0][0]=1;
        
        for (int i=1;i<=n;i++){
            for(int j = 0; j<= ss;j++){

                if(nums[i-1]<=j){
                    dp[i][j] = dp[i-1][j-nums[i-1]]+dp[i-1][j];
                } else {
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
        
        return dp[n][ss];


    }
}
