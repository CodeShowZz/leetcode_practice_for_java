package com.leetcode.middle;

import com.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-14 14:11
 */
public class Flatten_114 {

    public void flatten(TreeNode root) {
        List<TreeNode> treeNodeList = new ArrayList<>();
        preOrder(treeNodeList, root);
        for(int i = 1; i < treeNodeList.size();i++) {
            TreeNode node = treeNodeList.get(i);
            root.left = null;
            root.right = node;
            root = root.right;
        }
    }

    public void preOrder(List<TreeNode> treeNodeList, TreeNode root) {
        if(root == null) {
            return;
        }
        treeNodeList.add(root);
        preOrder(treeNodeList,root.left);
        preOrder(treeNodeList,root.right);
    }
}