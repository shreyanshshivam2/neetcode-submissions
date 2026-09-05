class Solution {
    public int mySqrt(int x) {
        
    long l = 0, h = x,mid=0; 

    while(l<=h){
        mid = l+ (h-l)/2;
        if(mid*mid == x)
        return (int)mid;
        if (mid*mid > x)
        h = mid-1;
        else
        l= mid+1;
    }
    return (int)l-1;
    }
}