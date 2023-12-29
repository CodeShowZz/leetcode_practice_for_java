package com.leetcode.simple;

import com.leetcode.model.TreeNode;

/**
 * @author lin
 * @date 2023/12/24 4:43
 **/
public class MaxDepth_104 {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return dfs(root);
    }

    public int dfs(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftLevel = dfs(root.left) ;
        int rightLevel = dfs(root.right);
        return Math.max(leftLevel,rightLevel) + 1;
    }

}
