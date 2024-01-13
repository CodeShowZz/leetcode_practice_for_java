package com.leetcode.middle;

/**
 * @author lin
 * @date 2024/01/04 10:33
 **/
public class MaxProfit_309 {

    public int maxProfit(int[] prices) {
      int len = prices.length;
      int [][] dp = new int[len][3];
      dp[0][0] = -prices[0];
      dp[0][1] = 0;
      dp[0][2] = 0;
      for(int i = 1; i < len;i++) {
          dp[i][0] = Math.max(dp[i-1][0],dp[i-1][2] - prices[i]);
          dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0] + prices[i]);
          dp[i][2] = Math.max(dp[i-1][1],dp[i-1][2]);
      }
      return dp[len-1][1];
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 0, 2};
        int res = new MaxProfit_309().maxProfit(prices);
        System.out.println(res);
    }
}
