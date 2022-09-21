package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // create empty list
        // create a hashtable
        // start loop until end of list
            // sort the string and place inside hashtable
        // turn hashtable entries into list
        // add list into whole list
        
        List<List<String>> finalList = new LinkedList<List<String>>();
        Map<String, List<String>> groups = new HashMap<String, List<String>>();
        
        for(String str : strs){
            char[] sorted = new char[26];
            for(char c : str.toCharArray()){
                sorted[c - 'a']++;
            }
            String sortedStr = new String(sorted);
            if(groups.containsKey(sortedStr)){
                groups.get(sortedStr).add(str);
            }else{
                List<String> newList = new ArrayList<>();
                newList.add(str);
                groups.put(sortedStr, newList);
            }
        }

        finalList.addAll(groups.values());
        return finalList;
    }
}
