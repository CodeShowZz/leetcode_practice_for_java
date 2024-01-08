package com.leetcode.middle;

import com.leetcode.model.TreeNode;

/**
 * @author lin
 * @date 2024/1/2 4:03
 **/
public class Rob_337 {

    public int rob(TreeNode root) {
        int[] result = robInternal(root);
        return Math.max(result[0], result[1]);
    }

     public int[] robInternal(TreeNode root) {
        int [] res = new int[2];
        if(root == null) {
            return res;
        }
        int [] left = robInternal(root.left);
        int [] right = robInternal(root.right);
        res[0] = Math.max(left[0],left[1])  + Math.max(right[0],right[1]);
        res[1] = root.val + left[0] + right[0];
        return res;
     }
}
