class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int l = s.length();
        if (l==0||l==1)
        return l;


        int max =  Integer.MIN_VALUE;
        String temp = "";

        for (char c : s.toCharArray()){
            if(temp.contains(String.valueOf(c))){
              
                temp =  temp.substring(temp.indexOf(c)+1, temp.length())+Character.toString(c);

            } else {
                temp += Character.toString(c);
                max =  Math.max(max, temp.length());

            }

        }


return max;

    }
}