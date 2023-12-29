package com.leetcode.middle;

/**
 * @author lin
 * @date 2023/12/20 23:05
 **/
public class Rob_198 {

    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int [] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int k = 2;k <=n;k++) {
            dp[k] = Math.max(dp[k-1],nums[k-1] + dp[k-2]);
        }
        return dp[n];
    }
}
