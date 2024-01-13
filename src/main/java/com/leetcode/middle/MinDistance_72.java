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
 * @date: 2024-1-2 21.34
 */
public class MinDistance_72 {

    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        if(len1 == 0 || len2 == 0) {
            return len1 == 0 ? len2 : len1;
        }
        int row = len1 + 1;
        int column = len2 +1;
        int [][] res =new int[row][column];

        for(int i = 0; i < row;i++) {
            for(int j = 0 ; j < column;j++) {
                if(i == 0 && j == 0) {
                    res[i][j] = 0;
                } else if(i == 0) {
                    res[i][j] = res[i][j-1] +1;
                } else if(j == 0) {
                    res[i][j] = res[i-1][j] + 1;
                } else if(i != 0 && j != 0) {
                    if(word1.charAt(i-1) == word2.charAt(j-1)) {
                        res[i][j] = res[i-1][j-1];
                    } else {
                        res[i][j] =  Math.min(Math.min(res[i-1][j-1],res[i][j-1]),res[i-1][j]) + 1;
                    }
                }
            }
        }
        return res[row-1][column-1];
    }
}