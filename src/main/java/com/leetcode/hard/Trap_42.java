package com.leetcode.hard;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-10 15:47
 */
public class Trap_42 {

    public int trap(int[] height) {
        int len = height.length;
        if (len <= 2) {
            return 0;
        }
        int[] lMax = new int[len];
        int[] rMax = new int[len];
        lMax[0] = 0;
        int tempLMax = height[0];
        rMax[len - 1] = 0;
        int tempRMax = height[len-1];
        for(int i = 1;i<len;i++) {
            lMax[i] = tempLMax;
            tempLMax = Math.max(height[i],tempLMax);
            rMax[len-i-1] = tempRMax;
            tempRMax = Math.max(height[len-i-1],tempRMax);
        }
        int area = 0;
        for(int i = 0;i<len;i++) {
            area = area + Math.max(Math.min(lMax[i],rMax[i]) - height[i],0);
        }
        return area;
    }

    public static void main(String[] args) {
        int [] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        new Trap_42().trap(nums);
    }
}