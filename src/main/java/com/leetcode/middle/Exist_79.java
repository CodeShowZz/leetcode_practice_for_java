package com.leetcode.middle;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-13 16:49
 */
public class Exist_79 {

    public static int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public boolean exist(char[][] board, String word) {
        if (board == null || board[0] == null || word == null || "".equals(word)) {
            return false;
        }
        int row = board.length;
        int column = board[0].length;
        boolean[][] visited = new boolean[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (dfs(board, word, row, column, i, j, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int row, int column, int x, int y, int index, boolean[][] visited) {
        if (index == word.length() - 1) {
            return board[x][y] == word.charAt(word.length() - 1);
        }
        if (word.charAt(index) == board[x][y]) {
            visited[x][y] = true;
            for (int i = 0; i < DIRECTIONS.length; i++) {
                int newX = x + DIRECTIONS[i][0];
                int newY = y + DIRECTIONS[i][1];
                if (inBoard(newX, newY, row, column) && !visited[newX][newY]) {
                    if (dfs(board, word, row, column, newX, newY, index + 1, visited)) {
                        return true;
                    }
                }
            }
            visited[x][y] = false;
        }
        return false;
    }

    private boolean inBoard(int x, int y, int row, int column) {
        return (x >= 0 && x < row) && (y >= 0 && y < column);
    }
}