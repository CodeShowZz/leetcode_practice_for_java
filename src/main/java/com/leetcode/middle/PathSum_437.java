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
        if (root == null) {
            return 0;
        }
        int res = dfs(root,sum);
        res = res + pathSum(root.left,sum);
        res = res + pathSum(root.right,sum);
        return res;
    }

    public int dfs(TreeNode root, long target) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        int val = root.val;
        if (val == target) {
            res = res + 1;
        }
        res = res + dfs(root.left,target-val);
        res = res + dfs(root.right,target-val);
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