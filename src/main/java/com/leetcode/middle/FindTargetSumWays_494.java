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
        dfs(nums, target,0);
        return count;
    }

    public void dfs(int[] nums, int sum,int index) {
        if(index == nums.length) {
            if(sum == 0) {
                count++;
            }
            return;
        }
        dfs(nums,sum - nums[index],index+1);
        dfs(nums,sum + nums[index],index+1);
    }


    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int count = new FindTargetSumWays_494().findTargetSumWays(nums, 3);
        System.out.println(count);
    }
}