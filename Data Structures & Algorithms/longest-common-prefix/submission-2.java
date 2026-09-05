class Solution {
    public String longestCommonPrefix(String[] strs) {
// String res = "";
int flag = 0;
    for(int i = 0; i < strs[0].length(); i++){
     char c = strs[0].charAt(i);  //c =a i =0
     for (int j = 1; j < strs.length; j++ ) {
        if ( i >= strs[j].length() || c != strs[j].charAt(i)){
                return strs[j].substring(0,i);                
        }
     }

    }
        return strs[0];
    }
}