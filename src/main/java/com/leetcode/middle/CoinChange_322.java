package com.leetcode.middle;

import com.leetcode.sort.QuickSort;

import java.lang.reflect.Parameter;
import java.util.*;

/**
 * @author lin
 * @date 2024/01/08 11:15
 **/
public class CoinChange_322 {


    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin > i) {
                    continue;
                } else {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        new CoinChange_322().coinChange(coins, 11);
    }


}
