package com.leetcode.middle;


/**
 * @author lin
 * @date 2024/1/2 22.07
 **/
public class MaxProduct_152 {

    public int maxProduct(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        int [][] dp = new int[len][2];
        dp[0][0] = nums[0];
        dp[0][1] = nums[0];
        for(int i = 1 ; i < len ; i++) {
            dp[i][0] = Math.max(Math.max(dp[i-1][0] * nums[i],nums[i]),dp[i-1][1] * nums[i]);
            dp[i][1] = Math.min(Math.min(dp[i-1][0] * nums[i],nums[i]),dp[i-1][1] * nums[i]);
            max = Math.max(max,dp[i][0]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int res = new MaxProduct_152().maxProduct(nums);
    }
}
