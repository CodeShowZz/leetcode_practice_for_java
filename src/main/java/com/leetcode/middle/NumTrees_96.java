package com.leetcode.middle;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-12 16:14
 */
public class NumTrees_96 {

    public int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                G[i] = G[i] + G[i - j - 1] * G[j];
            }
        }
        return G[n];
    }

}