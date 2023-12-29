package com.leetcode.simple;

import com.leetcode.model.TreeNode;

/**
 * @author lin
 * @date 2023/12/24 4:32
 **/
public class IsSymmetric_101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return dfs(root.left,root.right);
    }

    public boolean dfs(TreeNode left,TreeNode right) {
        if(left == null || right == null) {
            if(left == null && right == null) {
                return true;
            } else {
                return false;
            }
        }
        if(left.val != right.val) {
            return false;
        }
        return dfs(left.left,right.right) && dfs(left.right,right.left);
    }



}
