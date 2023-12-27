package com.leetcode;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-26 15:14
 */
public class NumIslands_200 {

    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }
        int row = grid.length;
        int column = grid[0].length;
        int num = 0;
        for(int i = 0 ; i < row;i++) {
            for(int j = 0 ; j < column; j ++ ) {
                if(grid[i][j] == '1') {
                    num++;
                    dfs(grid,i,j);
                }
            }
        }
        return num;
    }

    public void dfs(char [][] grid,int x,int y ){
        if(!inArea(grid,x,y)) {
            return;
        }
        if(grid[x][y] == '0') {
            return;
        }
        grid[x][y] = '0';
        dfs(grid,x-1,y);
        dfs(grid,x+1,y);
        dfs(grid,x,y-1);
        dfs(grid,x,y+1);
    }

    public boolean inArea(char [][] grid,int x,int y) {
        return x >= 0 && x < grid.length && y >=0 && y < grid[0].length;
    }

}