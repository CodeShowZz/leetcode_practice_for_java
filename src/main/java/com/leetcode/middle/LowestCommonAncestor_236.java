package com.leetcode.middle;

import com.leetcode.model.TreeNode;

/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2023-12-29 17:12
 */
public class LowestCommonAncestor_236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null && right == null) {
            return null;
        } else if(left == null && right != null) {
            return right;
        } else if(left != null && right == null) {
            return left;
        } else if(left != null && right != null) {
            return root;
        }
        return root;
    }




}