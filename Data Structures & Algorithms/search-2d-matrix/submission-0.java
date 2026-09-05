class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length, n =matrix[0].length;
        int l = 0, h = m-1;

        while(l<=h){
            int mid_matrix = l + (h-l)/2;
            if (matrix[mid_matrix][0]<= target && matrix[mid_matrix][n-1]>= target){
                return (binary(matrix[mid_matrix], target));
            } else if (matrix[mid_matrix][0]>target){
                h = mid_matrix-1;
            }else {
                 l = mid_matrix+1;
            }
            
        }
        return false;
    }

    private boolean binary(int[]nums, int target){
        int l =0, mid =0, h = nums.length-1;

        while(l<=h){
            mid = l + (h-l)/2;
            if(nums[mid]==target)
            return true;
            else if (nums[mid]>target){
                h = mid-1;
            }
            else {
               l = mid+1;
            }
        }
        return false;

    }
}