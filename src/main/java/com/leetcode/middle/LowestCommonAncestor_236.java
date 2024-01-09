package com.leetcode.middle;

import com.leetcode.model.TreeNode;

/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2024-01-09 16:45
 */
public class LowestCommonAncestor_236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root,p,q);
    }

   public TreeNode dfs(TreeNode root,TreeNode p,TreeNode q) {
        if(root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = dfs(root.left,p,q);
        TreeNode right = dfs(root.right,p,q);
        if(left == null && right == null) {
            return null;
        } else if(left == null && right != null) {
            return right;
        } else if(left != null && right == null) {
            return left;
        } else if(left != null && right != null) {
            return root;
        }
        return null;
    }




}