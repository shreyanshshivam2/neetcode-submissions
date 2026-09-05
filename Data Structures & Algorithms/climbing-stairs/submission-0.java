class Solution {
    public int climbStairs(int n) {
        int [] arr = new int[n+1];
        Arrays.fill(arr, -1);
    

    return max(n, arr);
}


    private int max(int n, int []arr) {

        if (n <=2){
            return n;
        }

        if (arr[n]!= -1){
            return arr[n];
        }

        arr[n] = max(n-1,arr) + max(n-2,arr);
        return arr[n];
    }
}
