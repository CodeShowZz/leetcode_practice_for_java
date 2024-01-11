package com.leetcode.middle;

import java.util.*;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-11 17:44
 */
public class LeastInterval_621 {

    public int leastInterval(char[] tasks, int n) {
        int[] temp = new int[26];
        int count = 0;
        int max = 0;
        for (char c : tasks) {
            temp[c - 'A']++;
            max = Math.max(temp[c - 'A'], max);
        }
        for (int i = 0; i < 26; i++) {
            if (temp[i] == max) {
                count++;
            }
        }
        return Math.max(tasks.length, (max - 1) * (n + 1) + count);
    }

    public static void main(String[] args) {
        char[] chars = {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int res = new LeastInterval_621().leastInterval(chars, 2);
        System.out.println(res);
    }
}