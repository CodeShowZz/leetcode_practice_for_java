package com.leetcode.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * @author: Linhuang
 * @date: 2023-12-11 16:12
 */
public class Permute_46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 1) {
            return res;
        }
        boolean[] used = new boolean[nums.length];
        List<Integer> temp = new ArrayList<>();
        dfs(res,nums,used,temp);
        return res;
    }

    public void dfs(List<List<Integer>> res, int[] nums, boolean[] used, List<Integer> temp) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i]) {
                continue;
            }
            temp.add(nums[i]);
            used[i] = true;
            dfs(res,nums,used,temp);
            temp.remove(temp.size()-1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        new Permute_46().permute(new int[]{1,2,3});

    }
}