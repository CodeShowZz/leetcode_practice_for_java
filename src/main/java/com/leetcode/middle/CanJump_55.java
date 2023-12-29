package com.leetcode.middle;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-12 15:19
 */
public class CanJump_55 {

    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < i) {
                return false;
            }
            max = Math.max(max,nums[i]+i);
        }
        return true;
    }
}