package com.leetcode.middle;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-10 17:00
 */
public class CountSubstrings_647 {

    public int countSubstrings(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
            if (i != len - 1) {
                dp[i + 1][i] = true;
            }
        }
        for (int step = 1; step < len; step++) {
            for (int i = 0; i + step < len; i++) {
                int j = i + step;
                dp[i][j] = dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
            }
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j< len; j++) {
                if(dp[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int res = new CountSubstrings_647().countSubstrings("abccbd");
        System.out.println(res);
    }


}