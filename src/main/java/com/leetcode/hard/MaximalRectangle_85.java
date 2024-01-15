package com.leetcode.hard;

/**
 * @author lin
 * @date 2024/1/14 14:24
 **/
public class MaximalRectangle_85 {

    public int maximalRectangle(char[][] matrix) {
        int maxArea = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] width = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == '0') {
                    width[i][j] = 0;
                } else {
                    if (j == 0) {
                        width[i][j] = 1;
                    } else {
                        width[i][j] = width[i][j - 1] + 1;
                    }
                }
                int minWidth = width[i][j];
                for (int currentRow = i; currentRow >= 0; currentRow--) {
                    int height = (i - currentRow) + 1;
                    minWidth = Math.min(minWidth, width[currentRow][j]);
                    int area = minWidth * height;
                    maxArea = Math.max(maxArea,  area);
                }
            }
            }
        return maxArea;
    }

    public static void main(String[] args) {
        char[][] matrix = {{'1','0','1','1','1'},{'0','1','0','1','0'},{'1','1','0','1','1'},{'1','1','0','1','1'},{'0','1','1','1','1'}};
        int res = new MaximalRectangle_85().maximalRectangle(matrix);
        System.out.println(res);
    }
}
