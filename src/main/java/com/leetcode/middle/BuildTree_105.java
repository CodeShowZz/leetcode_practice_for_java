package com.leetcode.middle;

import com.leetcode.model.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @description:
 *
 *
 * 输入: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * 输出: [3,9,20,null,null,15,7]
 *
 * @author: Linhuang
 * @date: 2023-12-19 9:24
 */
public class BuildTree_105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> inOrderNumToIndexMap = new HashMap<>();
        for(int i = 0 ;i<inorder.length;i++) {
            inOrderNumToIndexMap.put(inorder[i],i);
        }
        return buildTree(preorder,0,preorder.length-1,0,preorder.length-1,inOrderNumToIndexMap);
    }

    public TreeNode buildTree(int [] preorder,int pL,int pR,int iL,int iR,Map<Integer,Integer> inOrderNumToIndexMap) {
        if(pL > pR || iL > iR) {
            return null;
        }
        int rootVal = preorder[pL];
        int inorderIndex = inOrderNumToIndexMap.get(rootVal);
        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(preorder,pL+1 ,pL + (inorderIndex-iL),iL,inorderIndex-1,inOrderNumToIndexMap);
        root.right = buildTree(preorder,pL + (inorderIndex-iL)+1 ,pR,inorderIndex + 1 ,iR,inOrderNumToIndexMap);
        return root;
    }
}