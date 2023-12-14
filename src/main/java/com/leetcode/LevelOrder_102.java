package com.leetcode;

import com.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-14 16:26
 */
public class LevelOrder_102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> levelToNumsList = new HashMap<>();
        dfs(levelToNumsList, root, 0);
        for(Map.Entry<Integer,List<Integer>> entry : levelToNumsList.entrySet()) {
            res.add(entry.getValue());
        }
        return res;
    }

    public void dfs(Map<Integer, List<Integer>> levelToNumsList, TreeNode root, int index) {
        if (root == null) {
            return;
        }
        levelToNumsList.computeIfAbsent(index,item -> new ArrayList<>()).add(root.val);
        dfs(levelToNumsList,root.left,index+1);
        dfs(levelToNumsList,root.right,index+1);
    }
}