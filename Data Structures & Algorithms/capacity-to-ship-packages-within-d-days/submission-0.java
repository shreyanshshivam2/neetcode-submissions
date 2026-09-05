class Solution {
    public int shipWithinDays(int[] weights, int days) {


    // find max 
    //     if capacity<max  never 

    //     min capacity = max -> n number of days 

    //     if cpacity >= sum of wieghts  -> 1 day 
    //     if capacity = max weight -> max days

    //     least weight for which days >= time

    //     helper method to calculate time

        int max_wt = Integer.MIN_VALUE;
        int sum_wt = 0;
        long mid =0;
        for (int wt: weights) {
            max_wt= Math.max(wt, max_wt);
            sum_wt += wt;
        }
        long calc_time;

       
        int  h =sum_wt, l= max_wt;

        while(l<=h){
            mid = l+(h-l)/2;
            //System.out.println("l"+l+" h"+h+" m"+mid);
            calc_time = time(weights,mid);
            //System.out.println("calc time "+calc_time);
            if (calc_time>days){
               //System.out.println("clac time > days ");
                l = (int)mid+1;
                //System.out.println("l updated to "+l);
            } else{
                //System.out.println("clac time <= days ");
                h = (int)mid-1;
                //System.out.println("h updated to "+h);
            }
        }
        return l;        
    }


    // private long time(int []weights, long capacity){
    //     long c =1;
    //     long orig_capacity =capacity;
    //     //System.out.println("orig capacity"+orig_capacity);
    //     for(int wt: weights){
    //         if(capacity>=wt){
    //            // System.out.println("capacity is"+capacity);
    //             //System.out.println("wt is"+wt);
    //             capacity = capacity-wt;
    //             //System.out.println("capacity left"+capacity);
    //         }else {
    //              //System.out.println("ccounter inc");
    //             c+=1;
    //              //System.out.println("capacity reset");
    //             capacity = orig_capacity-wt;
    //         }
    //     }
    //     System.out.println("time"+c);
    //     return c;
    // }

    private long time(int[] weights, long maxCapacity) {
    long requiredDays = 1;
    int capacity = 0;
    for (int weight : weights) {
        capacity += weight;
        if (capacity > maxCapacity) {
            requiredDays++;
            capacity = weight;
        }
    }
    return requiredDays;
}
}