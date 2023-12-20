package com.leetcode;/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2023-12-20 14:12
 */
public class MaxArea_11 {

    public int maxArea(int[] height) {
        if(height == null || height.length < 2) {
            return 0;
        }
        int left =0;
        int right = height.length - 1;
        int max = 0;
        while(left < right) {
            max = Math.max(max,(right - left) * Math.min(height[right],height[left]));
            if(height[left] > height[right]) {
                right --;
            } else {
                left ++;
            }
        }
        return max;
    }
}