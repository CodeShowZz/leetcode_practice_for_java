package com.leetcode.middle;

import java.util.*;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-11 17:44
 */
public class LeastInterval_621 {

    public int leastInterval(char[] tasks, int n) {
        int[] taskCountArr = new int[26];
        int maxCount = 0 ;
        int maxCountNum = 0;
        for(char task : tasks) {
            int index = task-'A';
            taskCountArr[index] = taskCountArr[index] + 1;
            maxCount = Math.max(maxCount,taskCountArr[index]);
        }
        for(int taskCount : taskCountArr) {
            if(taskCount == maxCount) {
                maxCountNum = maxCountNum + 1;
            }
        }
        return Math.max(tasks.length,(maxCount-1) * (n+1) + maxCountNum);
    }

    public static void main(String[] args) {
        char[] chars = {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int res = new LeastInterval_621().leastInterval(chars, 2);
        System.out.println(res);
    }
}