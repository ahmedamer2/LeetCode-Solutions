package Easy;

public class BinarySearch {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        int middle = (nums.length / 2) - 1;

        return BinarySearch(nums, 0, nums.length, middle, target);
    }

    public int BinarySearch(int[] nums, int start, int end, int middle, int target) {
        if (nums[middle] == target) {
            return middle;
        }

        if (nums[middle] > target) {
            return BinarySearch(nums, start, middle / 2, middle / 4, target);
        }
        if (nums[middle] < target) {
            return BinarySearch(nums, middle, end, (end - middle) / 2, target);
        }

        return -1;
    }
}
