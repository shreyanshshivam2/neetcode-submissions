class Solution {
    public int maxProfit(int[] prices) {

        if (prices.length == 1) 
        return 0;

        int max = 0;
        int start, profit =0;
        int buy = Integer.MAX_VALUE;

    for(start=0;start<prices.length;start++){
        if(prices[start]<=buy){
            buy = prices[start];
        }
        else {
            profit = prices[start]-buy;
            max = Math.max(profit, max);
        }          
    }
    return max;

    }    
}