package com.leetcode.middle;

import com.leetcode.model.TreeNode;

/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2024-01-10 14:34
 */
public class ConvertBST_538 {

    private int sum = 0;


    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        return root;
    }

    public void dfs(TreeNode root) {
        if(root == null) {
            return;
        }
        dfs(root.right);
        sum = sum + root.val;
        root.val = sum;
        dfs(root.left);
    }

}

