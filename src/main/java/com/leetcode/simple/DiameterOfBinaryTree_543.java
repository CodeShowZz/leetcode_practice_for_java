package com.leetcode.simple;

import com.leetcode.model.TreeNode;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-20 16:57
 */
public class DiameterOfBinaryTree_543 {

    public Integer max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
         dfs(root);
         return max;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftLevel = dfs(root.left) ;
        int rightLevel = dfs(root.right);
        max = Math.max(max,leftLevel+rightLevel);
        return Math.max(leftLevel, rightLevel) + 1;
    }
}