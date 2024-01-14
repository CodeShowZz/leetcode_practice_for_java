package com.leetcode.hard;

/**
 * @author lin
 * @date 2024/1/14 14:24
 **/
public class MaximalRectangle_85 {

    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int [][] width = new int[row][col];
        int maxArea = 0;
        for(int i = 0 ; i <row;i++) {
            for(int j = 0;j < col;j++) {
                if(matrix[i][j] == '0') {
                    width[i][j] = 0;
                } else {
                    if(j == 0) {
                        width[i][j] = matrix[i][j] - '0';
                    } else {
                        width[i][j] = width[i][j - 1] + 1;
                    }
                }
                int minWidth = width[i][j];
                for(int upRow = i;upRow>=0;upRow--) {
                    int height  = i - upRow + 1;
                    minWidth = Math.min(minWidth,width[upRow][j]);
                    int area = minWidth * height;
                    maxArea = Math.max(area,maxArea);
                }

            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        new MaximalRectangle_85().maximalRectangle(matrix);
    }
}
