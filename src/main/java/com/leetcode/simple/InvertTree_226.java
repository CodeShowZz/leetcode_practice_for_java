package com.leetcode.simple;

import com.leetcode.model.TreeNode;

/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2023-12-25 19:09
 */
public class InvertTree_226 {

    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        dfs(root);
        return root;
    }

    public void dfs(TreeNode root) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        dfs(root.left);
        dfs(root.right);
    }
}