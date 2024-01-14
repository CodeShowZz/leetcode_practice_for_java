package com.leetcode.middle;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-11 11:30
 */
public class SubarraySum_560 {

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumToCountMap = new HashMap<>();
        sumToCountMap.put(0, 1);
        int count = 0;
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
            if (sumToCountMap.get(sum - k) != null) {
                count = count + sumToCountMap.get(sum - k);
            }
            sumToCountMap.put(sum,sumToCountMap.getOrDefault(sum,0) + 1);
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int count = new SubarraySum_560().subarraySum(nums, 3);
        System.out.println(count);
    }
}