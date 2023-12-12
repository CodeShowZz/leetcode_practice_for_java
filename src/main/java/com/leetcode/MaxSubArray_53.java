package com.leetcode;

/**
 * @description: 示例 1：
 * <p>
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6
 * @author: Linhuang
 * @date: 2023-12-12 15:29
 */
public class MaxSubArray_53 {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) {
                sum = 0;
            }
            sum = sum + nums[i];
            max = Math.max(sum, max);
        }
        return sum;
    }
}