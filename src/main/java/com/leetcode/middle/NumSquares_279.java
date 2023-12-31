package com.leetcode.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author lin
 * @date 2023/12/31 18:59
 **/
public class NumSquares_279 {


    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp,n);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for(int j = 1 ; j * j <= i;j++) {
                dp[i] = Math.min(dp[i],dp[i-j*j] + 1);
            }
        }
        return dp[n];
    }



        public static void main (String[]args){
            new NumSquares_279().numSquares(12);
        }
    }