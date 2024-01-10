package com.leetcode.middle;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-10 15:47
 */
public class Trap_42 {

    public int trap(int[] height) {
        int len = height.length;
        int[] lMax = new int[len];
        int[] rMax = new int[len];
        lMax[0] = 0;
        rMax[len - 1] = 0;
        for (int i = 1; i < len; i++) {
            lMax[i] = Math.max(lMax[i - 1], height[i - 1]);
            rMax[len - 1 - i] = Math.max(rMax[len - i], height[len - i]);
        }

        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += Math.max(Math.min(lMax[i], rMax[i]) - height[i], 0);
        }
        return sum;
    }
}