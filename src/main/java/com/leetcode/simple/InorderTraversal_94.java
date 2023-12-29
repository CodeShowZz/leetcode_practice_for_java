package com.leetcode.simple;

import com.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lin
 * @date 2023/12/24 4:21
 **/
public class InorderTraversal_94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        dfs(res,root);
        return res;
    }

    public void dfs(List<Integer> res, TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(res,root.left);
        res.add(root.val);
        dfs(res,root.right);
    }
}
