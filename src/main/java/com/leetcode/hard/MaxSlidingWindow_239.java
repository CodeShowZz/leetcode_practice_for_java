package com.leetcode.hard;

import java.util.*;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-15 14:19
 */
public class MaxSlidingWindow_239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue((Comparator<int[]>) (o1, o2) -> o1[0] != o2[0] ? o2[0] - o1[0] : o2[1] - o1[1]);
        for (int i = 0; i < k; i++) {
             priorityQueue.add(new int[]{nums[i],i});
        }
        int len = nums.length;
        int [] res = new int[len-k+1];
        res[0] = priorityQueue.peek()[0];
        for(int i = k ; i < len ; i++) {
            while(priorityQueue.size() != 0 && priorityQueue.peek()[1] <= i-k) {
                priorityQueue.poll();
            }
            priorityQueue.add(new int[]{nums[i],i});
            res[i-k+1] = priorityQueue.peek()[0];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] res = new MaxSlidingWindow_239().maxSlidingWindow(nums, 3);
        System.out.println(Arrays.toString(res));
    }
}