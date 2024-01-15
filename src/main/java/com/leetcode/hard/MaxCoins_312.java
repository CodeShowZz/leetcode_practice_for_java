package com.leetcode.hard;

/**
 * @author lin
 * @date 2024/1/13 18:05
 **/
public class MaxCoins_312 {


    public int maxCoins(int[] nums) {
        int len = nums.length;
        int[] points = new int[len + 2];
        points[0] = 1;
        points[points.length - 1] = 1;
        for (int i = 1; i < len + 1; i++) {
            points[i] = nums[i - 1];
        }
        int max = 0;
        int[][] dp = new int[len + 2][len + 2];
        for (int left = len - 1; left >= 0; left--) {
            for (int right = left + 1; right < len + 2; right++) {
                for (int choose = left + 1; choose < right; choose++) {
                    int temp = points[left] * points[right] * points[choose] + dp[left][choose] + dp[choose][right];
                    dp[left][right] = Math.max(dp[left][right], temp);
                    max = Math.max(dp[left][right], max);

                }
            }
        }
        return dp[0][len + 1];
    }


    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 8};
        int res = new MaxCoins_312().maxCoins(nums);
        System.out.println(res);
    }
}
