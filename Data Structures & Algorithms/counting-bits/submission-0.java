class Solution {
    public int[] countBits(int n) {
        int []res =new int[n+1];
        for(int i =0;i<n+1;i++){
            res[i]=count(i);
        }
        return res;
    }

    private int count(int n){
        int ans =0;
        for(int i =0;i<32;i++){
            if(((n>>i)&1) !=0)
            ans++;
        }
        return ans;
    }
}
