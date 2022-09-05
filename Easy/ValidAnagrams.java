package Easy;

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        var sMap = new HashMap<Character, Integer>();

        for(char c : s.toCharArray()){
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }

        for(char d : t.toCharArray()){
            if(!sMap.containsKey(d) || sMap.get(d) == 0) return false;

            sMap.put(d, sMap.get(d) - 1);
        }
        return true;
    }
}
