class Solution {
    public boolean isAnagram(String s, String t) {
    boolean ret_val = true;
    if (s.length() != t.length())
    return false;
    HashMap<Character, Integer> hm = new HashMap<>();
    for(int i = 0; i < s.length(); i++){
        int value = hm.getOrDefault(s.charAt(i), 0);
        hm.put(s.charAt(i), value+1 );
    }

    for(int i = 0; i < t.length(); i++){        
        hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i), 0)-1);
    }

    for(int value: hm.values()){        
        if(value != 0)
        return false;
    }

    return ret_val;

    }
}
