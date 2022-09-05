package Easy;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 2){
            return new int[]{0,1};
        }

        var lookingFor = new HashMap<Integer, Integer>();

        for(int i = 0 ; i < nums.length; i++){
            if(lookingFor.containsKey(nums[i])){
                return new int[]{lookingFor.get(nums[i]), i};
            }
            lookingFor.put(target - nums[i], i);
        }
        return null;
    }
}
