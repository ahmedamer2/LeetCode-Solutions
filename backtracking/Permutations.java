package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    List<List<Integer>> res;

    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        find(nums, 0);
        return res;
    }

    public void find(int[] nums, int start){
        if(start == nums.length){
            List<Integer> curr = new ArrayList<>();
            for(int i = 0; i < start; i++){
                curr.add(nums[i]);
            }
            res.add(curr);
        }

        for(int i = start; i < nums.length; i++){
            swap(nums, i, start+1);
            find(nums, start+1);
            swap(nums, i, start+1);
        }
    }

    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
}
