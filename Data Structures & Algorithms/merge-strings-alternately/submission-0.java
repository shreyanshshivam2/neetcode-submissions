class Solution {
    public String mergeAlternately(String word1, String word2) {

int l =0, h =0;

        //Use Stringbuilder
        // String res ="";
        StringBuilder sb = new StringBuilder();
        while(l<word1.length() || h <word2.length()){
            if (l<word1.length()){
                sb.append(word1.charAt(l++));
            }
            if (h < word2.length()){
                sb.append(word2.charAt(h++));
            }
        }
        return sb.toString();
    }
}