class Solution {
    public boolean isPalindrome(String s) {
               int l =0, h = s.length()-1;
       s= s.toLowerCase();
       while(l<h){
        if(!Character.isLetterOrDigit(s.charAt(l))){
            l++;
        }
        else if(!Character.isLetterOrDigit(s.charAt(h))){
            h--;
        }
        else {
            if (s.charAt(l)!=s.charAt(h)){
            return false;
            }
        l++;
        h--;
        }

       }
       return true; 
    }
}
