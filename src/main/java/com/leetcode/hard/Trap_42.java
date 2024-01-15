package com.leetcode.hard;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-10 15:47
 */
public class Trap_42 {

    public int trap(int[] height) {
        int len = height.length;
        int [] lMax = new int[len];
        int [] rMax = new int[len];
        int lTempMax = 0;
        int rTempMax = 0;
        int count = 0;
        for(int i = 0;i < len;i++) {
            lMax[i] = lTempMax;
            lTempMax = Math.max(lTempMax,height[i]);
            rMax[len-i-1] = rTempMax;
            rTempMax = Math.max(rTempMax,height[len-i-1]);
        }
        for(int i = 0;i< len;i++) {
            count = count + Math.max(Math.min(lMax[i],rMax[i]) - height[i],0);
        }
        return count;
    }
}