package com.leetcode.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 示例 1：
 * <p>
 * 输入：candidates = [2,3,6,7], target = 7
 * 输出：[[2,2,3],[7]]
 * 解释：
 * 2 和 3 可以形成一组候选，2 + 2 + 3 = 7 。注意 2 可以使用多次。
 * 7 也是一个候选， 7 = 7 。
 * 仅有这两种组合
 * @author: Linhuang
 * @date: 2023-12-12 15:45
 */
public class CombinationSum_39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return res;
        }
        List<Integer> temp = new ArrayList<>();
        dfs(candidates, target, res, temp, 0);
        return res;
    }

    public void dfs(int[] candidates, int target, List<List<Integer>> res, List<Integer> temp, int index) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            temp.add(candidates[i]);
            dfs(candidates, target - candidates[i], res, temp, i);
            temp.remove(temp.size() - 1);
        }
    }
}