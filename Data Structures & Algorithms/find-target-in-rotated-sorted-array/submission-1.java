class Solution {
    public int search(int[] arr, int target) {
        int ans = -1, l= 0, h = arr.length-1;
        int mid =0;
        
        while (l<h){
            mid = l+(h-l)/2;

        if (arr[mid]<arr[h]){
            h = mid;
        } else {
            l = mid+1;
        }

        }
        int min_indx = l;
        ans = binary(arr, 0, l-1, target);
        if (ans !=-1)
        return ans ;
        else {
            ans = binary(arr, min_indx, arr.length-1, target);
                    if (ans !=-1)
                return ans ;
        }
        return -1;
    }
    private int binary(int []arr, int l,int h, int target){
        int mid =0;
        while(l<=h){
            mid = l+(h-l)/2;
            if(arr[mid]==target)
                return mid;
            if(arr[mid]>target)
            h = mid-1;
            else
            l = mid+1;
        }
        return -1;
    }
}
