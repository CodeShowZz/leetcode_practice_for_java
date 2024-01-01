package com.leetcode.middle;

import com.leetcode.sort.QuickSort;

import java.util.*;

/**
 * @author lin
 * @date 2024/1/1 19:25
 **/
public class CoinChange_322 {


    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin < 0) {
                    continue;
                }
                if(dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i-coin]+1,dp[i]);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }


}
