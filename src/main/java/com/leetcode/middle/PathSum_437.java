package com.leetcode.middle;

import com.leetcode.model.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-04 14:11
 */
public class PathSum_437 {

    public int pathSum(TreeNode root, long sum) {
        Map<Long, Integer> sumToCountMap = new HashMap<>();
        sumToCountMap.put(0L,1);
        return dfs(root,sum,0,sumToCountMap);
    }

    public int dfs(TreeNode root, long target, long currentSum, Map<Long, Integer> sumToCountMap) {
        if (root == null) {
            return 0;
        }
        int val = root.val;
        int res = 0;
        currentSum = currentSum + val;
        res = res + sumToCountMap.getOrDefault(currentSum-target,0);
        sumToCountMap.put(currentSum, sumToCountMap.getOrDefault(currentSum, 0) + 1);
        res = res + dfs(root.left, target, currentSum,sumToCountMap);
        res = res + dfs(root.right,target,currentSum,sumToCountMap);
        sumToCountMap.put(currentSum,sumToCountMap.get(currentSum) - 1);
        return res;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);
        int res = new PathSum_437().pathSum(root, 8);
        System.out.println(res);
    }


}