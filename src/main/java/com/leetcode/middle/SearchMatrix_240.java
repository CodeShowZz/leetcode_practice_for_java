package com.leetcode.middle;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-29 18:12
 */
public class SearchMatrix_240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        int x = 0;
        int y = column-1;
        while(x < row && y>=0) {
            int current = matrix[x][y];
            if(current == target) {
                return true;
            } else if(current < target) {
                x++;
            } else if(current > target) {
                y--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        new SearchMatrix_240().searchMatrix(matrix,5);
    }
}