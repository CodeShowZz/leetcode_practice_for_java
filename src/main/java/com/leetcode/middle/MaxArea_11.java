package com.leetcode.middle;

/**
 * @author lin
 * @date 2023/12/24 3:12
 **/
public class MaxArea_11 {

    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int left = 0;
        int max = 0;
        int right = height.length - 1;
        while (left < right) {
            max = Math.max(max,(right-left) * Math.min(height[left],height[right]));
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
