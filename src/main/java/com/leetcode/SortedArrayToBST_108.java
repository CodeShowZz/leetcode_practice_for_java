package com.leetcode;

import com.leetcode.model.TreeNode;

/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2023-12-19 18:28
 */
public class SortedArrayToBST_108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) {
            return null;
        }
        return sort(nums,0,nums.length-1);
    }

    public TreeNode sort(int [] nums,int left,int right) {
        if(left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sort(nums,left,mid-1);
        root.right =  sort(nums,mid+1,right);
        return root;
    }

}