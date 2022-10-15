package backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> res;
    List<Integer> currVals;
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        currVals = new ArrayList<>();
        dfs(0, candidates, target);
        return res;
    }
    
    public void dfs(int i, int[] candidates, int target){
        if(target == 0){
            res.add(new ArrayList<>(currVals));
            return;
        }
        else if(i >= candidates.length || target < 0){
            return;
        }
        
        currVals.add(candidates[i]);
        dfs(i, candidates, target-candidates[i]);
        
        currVals.remove(currVals.size()-1);
        dfs(i+1, candidates, target);
    }
}
