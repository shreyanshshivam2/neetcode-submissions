class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        //3 6 7 11
    // max speed piles.max
    // min speed min  ()
    // if h < p.size -> never 
    //     while h>0
    //     if p[i]<=k c++; h-c
    //     else  c += p[i]/k + 1/0 p[i]%k >0; h-c

    //     [4+3+2+1, 1+1+2+2, 1+1+1+2, 1+1+1+1]
    //     [10, 6, 5, 4 ]
        

    //     1  11
    //     27 4

        // Arrays.sort(piles);
        int max_num = Integer.MIN_VALUE;
        for(int n:piles){
            max_num = Math.max(max_num,n);
        }
        // int min =1, max = piles[piles.length-1];


        int low = 1, high = max_num;
        // int [] time_arr = new int [high+1];
        // HashMap <Integer, Integer> hm = new HashMap <>();

        // for (int i=1;i<=high;i++){
        //     // time_arr[i]=time(piles,i); 
        //     hm.put(i,time(piles,i) );
        // }
        int mid = 0;
        while(low<=high){
            mid = low+(high-low)/2;
            // if(time(piles,mid)<=h)
            // return mid;
            long calc = time(piles,mid);
            if (calc>h)
            low = mid+1;
            else
            high = mid-1;
        }

        return low;





        // System.out.println(Arrays.toString(time_arr));
        // if(h>=time_arr[1])
        // return 1;
        // int i = 1;
        // while((time_arr[i])>h){
        //     i++;
        // }

        // return i;
    } 
    
    private long time(int []nums, int k){
        long c =0;
        for (int pile : nums) {
            c += (pile + k - 1) / k;
        }
        return c;
    } 
}