package com.leetcode.middle;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-03 15:20
 */
public class MaximalSquare_221 {

    public int maximalSquare(char[][] matrix) {
        int max = 0;
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] res = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0 || j == 0) {
                    res[i][j] = matrix[i][j] == '0' ? 0 : 1;
                    continue;
                } else if (matrix[i][j] == '0') {
                    res[i][j] = 0;
                } else {
                    res[i][j] = Math.min(Math.min(res[i - 1][j - 1], res[i][j - 1]), res[i - 1][j]) + 1;
                }
                max = Math.max(max, res[i][j]);
            }
        }
        return max * max;
    }

    public static void main(String[] args) {
//        char [][]res = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        char[][] res = {{'0', '1'}, {'1', '0'}};
        int max = new MaximalSquare_221().maximalSquare(res);
        System.out.println(max);
    }

}