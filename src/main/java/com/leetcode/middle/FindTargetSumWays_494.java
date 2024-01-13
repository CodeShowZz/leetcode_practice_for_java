package com.leetcode.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-09 18:19
 */
public class FindTargetSumWays_494 {

    private int count = 0;

    public int findTargetSumWays(int[] nums, int target) {
        dfs(0, nums, 0, target);
        return count;
    }

    public void dfs(int index, int[] nums, int sum, int target) {
        if (index == nums.length) {
            if (sum == target) {
                count++;
            }
            return;
        }
        dfs(index + 1, nums, sum + nums[index], target);
        dfs(index + 1, nums, sum - nums[index], target);
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int count = new FindTargetSumWays_494().findTargetSumWays(nums,3);
        System.out.println(count);
    }
}