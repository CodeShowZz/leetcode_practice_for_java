package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-14 14:44
 */
public class LongestConsecutive_128 {

    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!set.contains(num - 1)) {
                int tempMax = 1;
                while (set.contains(num + 1)) {
                    tempMax = tempMax + 1;
                    num = num + 1;
                }
                max = Math.max(max, tempMax);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        new LongestConsecutive_128().longestConsecutive(nums);
    }
}