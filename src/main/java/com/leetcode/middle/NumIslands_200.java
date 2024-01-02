package com.leetcode.middle;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024/1/3 0:03
 */
public class NumIslands_200 {

    public int numIslands(char[][] grid) {

        int row = grid.length;
        int column = grid[0].length;
        boolean[][] visited = new boolean[row][column];
        int num = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '0') {
                    continue;
                }
                num = num + 1;
                dfs(i,j,grid,visited);
            }
        }
        return num;
    }

    public void dfs(int x, int y, char[][] grid, boolean[][] visited) {
        if (!inArea(x, y, grid) || visited[x][y]) {
            return;
        }
        if (grid[x][y] == '0') {
            return;
        }
        grid[x][y] = '0';
        visited[x][y] = true;
        dfs(x - 1, y, grid, visited);
        dfs(x + 1, y, grid, visited);
        dfs(x, y - 1, grid, visited);
        dfs(x, y + 1, grid, visited);
    }

    public boolean inArea(int x, int y, char[][] grid) {
        return x >= 0 && x < grid.length && y >= 0 && y < grid[0].length;
    }

}