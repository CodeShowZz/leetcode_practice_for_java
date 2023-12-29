package com.leetcode.middle;

/**
 * @description: 给你两个单词 word1 和 word2， 请返回将 word1 转换成 word2 所使用的最少操作数  。
 * <p>
 * 你可以对一个单词进行如下三种操作：
 * <p>
 * 插入一个字符
 * 删除一个字符
 * 替换一个字符
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：word1 = "horse", word2 = "ros"
 * 输出：3
 * 解释：
 * horse -> rorse (将 'h' 替换为 'r')
 * rorse -> rose (删除 'r')
 * rose -> ros (删除 'e')
 * @author: Linhuang
 * @date: 2023-12-11 15:50
 */
public class MinDistance_72 {

    public int minDistance(String word1, String word2) {
        int row = word1.length() + 1;
        int column = word2.length() + 1;
        int[][] dp = new int[row][column];
        dp[0][0] = 0;
        for (int j = 1; j < column; j++) {
            dp[0][j] = dp[0][j - 1] + 1;
        }
        for (int i = 1; i < row; i++) {
            dp[i][0] = dp[i - 1][0] + 1;
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                }
            }
        }
        return dp[row-1][column-1];
    }
}