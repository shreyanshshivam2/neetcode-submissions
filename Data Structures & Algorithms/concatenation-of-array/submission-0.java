class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] res = new int[2*nums.length];
        int l = nums.length;
        int n = 2*nums.length;
        for (int i = 0; i<n;i++){
            if (i<l){
                res[i] = nums[i];
            }
            else if (i>=l){
                res[i] = nums[i-l] ;
            }
        }
        return res;
    }
}