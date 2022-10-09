package twoPointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, width = height.length-1;
        int highest = 0;
        while(left < right){
            int lowerSide = height[left] < height[right] ? height[left] : height[right];
            if(lowerSide * width > highest){
                highest = lowerSide*width;
            } 
            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }
            width--;
        }
        return highest;
    }
}
