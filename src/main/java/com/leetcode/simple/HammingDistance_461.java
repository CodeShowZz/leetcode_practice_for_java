package com.leetcode.simple;/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2023-12-25 19:28
 */
public class HammingDistance_461 {

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}