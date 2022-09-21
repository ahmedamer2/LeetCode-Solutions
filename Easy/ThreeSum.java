package Easy;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;

public class ThreeSum{
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> finalList = new LinkedList<List<Integer>>();

        for(int i = 0; i < nums.length-2; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int target = 0 - nums[i];
                int left = i+1, right = nums.length-1;
            
                while(left < right){
                    if(nums[left] + nums[right]  == target){
                        ArrayList<Integer> inner = new ArrayList<>();
                        inner.add(nums[i]);
                        inner.add(nums[left]);
                        inner.add(nums[right]);
                        finalList.add(inner);

                        while(left< right && nums[left] == nums[left+1]){
                            left ++;
                        }
                        while(left < right && nums[right] == nums[right-1]){
                            right--;
                        }
                        
                        left++;
                        right--;
                    }

                    else if(nums[left] + nums[right] > target){
                        right--;
                    }
                    else{
                        left++;
                    }  

                }
            }
        }
        return finalList;
    }
}