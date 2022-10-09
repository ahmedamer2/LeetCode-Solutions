package BinarySearch;

public class BinarySearch {
    public int search(int[] nums, int target) {
        if(nums.length == 1 && nums[0] != target){
            return -1;
        }

        int start = 0, end = nums.length-1;
        while(start <= end){
            int middle = (start+ end)/2;
            if(nums[middle] == target){
                return middle;
            }
            else if(nums[middle] > target){
                end = middle - 1;
            }
            else{
                start = middle + 1;
            }
        }
        return -1;
    }

}
