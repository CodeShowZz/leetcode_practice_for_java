package com.leetcode.middle;

/**
 * @author lin
 * @date 2024/1/2 23:59
 */
public class Rob_198 {

    public int rob(int[] nums) {
        int max = nums[0];
        int len = nums.length;
        int[][] dp = new int[len][2];
        dp[0][0] = nums[0];
        dp[0][1] = 0;
        for (int i = 1; i < len; i++) {
             dp[i][0] = Math.max(dp[i-1][1] + nums[i],dp[i-1][0]);
             dp[i][1] = dp[i-1][0];
        }
        return dp[len-1][1];
    }
}
