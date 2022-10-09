package arraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class topKFrequent {

    public int[] answer(int[] nums, int k){
        Map<Integer, Integer> counts = new HashMap<>();

        for(int x : nums){
            counts.put(x, counts.getOrDefault(x, 0) + 1);
        }

        // Create a list out of the map
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<>(nums.length+1);
        for(int i = 0; i <= nums.length; i++){
            bucket.add(new ArrayList<>());
        }

        for(Map.Entry<Integer, Integer> entry : counts.entrySet()){
            bucket.get(entry.getValue()).add(entry.getKey());
        }

        int[] res = new int[k];
        int x = 0;

        for(int i = nums.length; i > 0; i--){
            if(bucket.get(i) != null && bucket.get(i).isEmpty()){
                continue;
            }

            for(Integer j : bucket.get(i)){
                if(k <= 0) return res;

                res[x] = j;
                x++;
                k--;
            }
        }

        return res;
    }
}
