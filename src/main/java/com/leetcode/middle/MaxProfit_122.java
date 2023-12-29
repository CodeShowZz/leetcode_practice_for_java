package com.leetcode.middle;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-14 16:46
 */
public class MaxProfit_122 {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int len = prices.length;
        int[][] dp = new int[len][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0] - prices[i]);
        }
        return dp[len-1][0];
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        new MaxProfit_122().maxProfit(prices);
    }

}