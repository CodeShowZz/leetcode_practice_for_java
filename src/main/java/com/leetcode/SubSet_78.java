package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 示例 1：
 * <p>
 * 输入：nums = [1,2,3]
 * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * @author: Linhuang
 * @date: 2023-12-12 15:02
 */
public class SubSet_78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        List<Integer> temp = new ArrayList<>();
        dfs(res, nums, temp, 0);
        return res;
    }

    public void dfs(List<List<Integer>> res, int[] nums, List<Integer> temp, int index) {
        if (index == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        dfs(res, nums, temp, index + 1);
        temp.add(nums[index]);
        dfs(res, nums, temp, index + 1);
        temp.remove(temp.size() - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> res = new SubSet_78().subsets(nums);
        System.out.println(res);
    }

}