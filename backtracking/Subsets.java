package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    List<List<Integer>> res;
    List<Integer> current;
    
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        current = new ArrayList<>();
        dfs(0, nums);
        return res;
    }
    
    public void dfs(int i, int[] nums){
        if(i >= nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        
        // add the element and traverse:
        current.add(nums[i]);
        dfs(i+1, nums);
        
        // pop the element just added and traverse:
        current.remove(current.size()-1);
        dfs(i+1, nums);
    }
}
