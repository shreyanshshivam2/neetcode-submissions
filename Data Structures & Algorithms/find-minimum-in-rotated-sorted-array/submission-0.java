class Solution {
    public int findMin(int[] arr) {
        int l = 0, h= arr.length-1, mid =0;
        while(l<h){
            mid = l+(h-l)/2;
            // if(arr[l]<arr[h])
            //     break;
            if (arr[mid]<arr[h]){
                h = mid;
            }
            else
                 l = mid+1;
                
            }
            return arr[l];
        }

    }



// 0,1,2,4,5,6,7
// 7 0 1 2 4 5 6===========
// 6 7 0 1 2 4 5
// 5 6 7 0 1 2 4
// 4 5 6 7 0 1 2
// 2 4 5 6 7 0 1