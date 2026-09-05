class Solution {
    public int search(int[] nums, int target) {
        int low =0, high =nums.length-1;
        return (binary(nums, low,high, target));

    }


    private int binary(int []nums, int low, int high, int target){
        if (low > high) return -1;
        int mid = low+(high-low)/2;
        if(nums[mid] == target)
        return mid;
        
        if (nums[mid]>target)
        high = mid-1;
        else
        low = mid+1;
        return (binary(nums, low, high, target));
    }
}