package com.leetcode.middle;

/**
 * @author lin
 * @date 2024/1/3 23:42
 **/
public class CanPartition_416 {

    public boolean canPartition(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return false;
        }
        int sum = 0;
        int max = 0;
        for (int num : nums) {
            sum = sum + num;
            max = Math.max(max, num);
        }
        if (sum % 2 != 0) {
            return false;
        }
        if (max > sum / 2) {
            return false;
        }
        int column = sum / 2 + 1;
        boolean[][] dp = new boolean[len][column];
        dp[0][0] = true;
        dp[0][nums[0]] = true;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < column; j++) {
                if (j >= nums[i]) {
                    dp[i][j] = dp[i - 1][j] | dp[i - 1][j-nums[i]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[len - 1][column-1];
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,5};
        boolean res = new CanPartition_416().canPartition(nums);
        System.out.println(res);
    }
}
