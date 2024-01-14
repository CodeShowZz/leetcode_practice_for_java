package com.leetcode.middle;

/**
 * @author lin
 * @date 2024/1/3 23:42
 **/
public class CanPartition_416 {

    public boolean canPartition(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int max = 0;
        for (int i = 0; i < len; i++) {
            sum = sum + nums[i];
            max = Math.max(nums[i], max);
        }
        if (sum % 2 != 0) {
            return false;
        }
        int half = sum / 2;
        if (max > half) {
            return false;
        }
        boolean[][] dp = new boolean[len][half+1];
        dp[0][0] = true;
        dp[0][nums[0]] = true;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j <= half; j++) {
                if(nums[i] > j) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j] | dp[i-1][j - nums[i]];
                }
            }
        }
        return dp[len-1][half];
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 5};
        boolean res = new CanPartition_416().canPartition(nums);
        System.out.println(res);
    }
}
