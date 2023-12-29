package com.leetcode.middle;


import com.leetcode.model.TreeNode;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-13 17:12
 */
public class IsValidBST_98 {

    private long pre = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if (root.val <= pre) {
            return false;
        }
        pre = root.val;
        if (!isValidBST(root.right)) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        boolean res = new IsValidBST_98().isValidBST(root);
        System.out.println(res);
    }
}