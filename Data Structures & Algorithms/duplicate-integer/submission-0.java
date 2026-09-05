class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean return_val = false;
    for (int i =0; i< nums.length;i++){
        for (int j = i+1;j<nums.length;j++){
            if(nums[i]==nums[j])
                return_val = true;
        }
    }
    return return_val;

    }
}