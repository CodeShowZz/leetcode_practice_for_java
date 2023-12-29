package com.leetcode.simple;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-14 16:33
 */
public class MaxProfit_121 {

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(prices[i]-min,max);
            min = Math.min(prices[i],min);
        }
        return max;
    }
}