package com.leetcode.middle;

/**
 * @author lin
 * @date 2024/1/1 17:55
 **/
public class MaxProfit_309 {

    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }
        int len = prices.length;
        int [][] res = new int[len][3];
        res[0][0] = -prices[0];
        res[0][1] = 0;
        res[0][2] = 0;
        for(int i = 1;i< len;i++) {
            res[i][0] = Math.max(res[i-1][0],res[i-1][2] - prices[i]);
            res[i][1] = Math.max(Math.max(res[i-1][1],res[i-1][2]),res[i-1][0] + prices[i]);
            res[i][2] = Math.max(res[i-1][1],res[i-1][2]);
        }
        return Math.max(res[prices.length-1][1],res[prices.length-1][2]);
    }

    public static void main(String[] args) {
        int [] prices = {1,2,3,0,2};
        int res = new MaxProfit_309().maxProfit(prices);
        System.out.println(res);
    }
}
