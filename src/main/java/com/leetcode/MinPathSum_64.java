package com.leetcode;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-11 16:44
 */
public class MinPathSum_64 {

    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length < 1 || grid[0] == null || grid[0].length < 1) {
            return 0;
        }
        int row = grid.length;
        int column = grid[0].length;
        int[][] res = new int[row][column];
        res[0][0] = grid[0][0];
        for (int i = 1; i < row; i++) {
            res[i][0] = res[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < column; j++) {
            res[0][j] = res[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                res[i][j] = Math.min(res[i - 1][j], res[i][j - 1]) + grid[i][j];
            }
        }
        return res[row-1][column-1];
    }

    public static void main(String[] args) {
        int [][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        new MinPathSum_64().minPathSum(grid);

    }
}