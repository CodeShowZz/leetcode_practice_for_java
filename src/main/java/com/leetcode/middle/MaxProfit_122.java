package com.leetcode.middle;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-1-2 21.57
 */
public class MaxProfit_122 {

    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int len = prices.length;
        int [][] dp = new int[len][2];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for(int i = 1;i<len;i++) {
            int price = prices[i];
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] - price);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0] + price);
        }
        return dp[len-1][1];
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        new MaxProfit_122().maxProfit(prices);
    }

}