package com.leetcode;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-27 17:56
 */
public class MaximalSquare_221 {

    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int row = matrix.length;
        int column = matrix[0].length;
        int max = 0;
        int[][] res = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(matrix[i][j] == '1') {
                    if(i== 0 || j ==0) {
                        res[i][j] = 1;
                    } else {
                        res[i][j] = Math.min(Math.min(res[i-1][j],res[i][j-1]),res[i-1][j-1]) + 1;
                    }
                    max = Math.max(max,res[i][j]);
                }
            }
        }
        return max * max;
    }

    public static void main(String[] args) {
        //char [][]res = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        char [][]res = {{'0','1'},{'1','0'}};
        int max = new MaximalSquare_221().maximalSquare(res);
        System.out.println(max);
    }

}