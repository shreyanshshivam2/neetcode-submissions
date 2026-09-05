class Solution {
    public void reverseString(char[] s) {
        
        int f = 0;
        int l = s.length-1;
        char temp;
        if (f != l){
        while (f<l){
            temp = s[f];
            s[f] = s[l];
            s[l] = temp;
            f= f+1;
            l = l-1;
        }
        }
    }
}