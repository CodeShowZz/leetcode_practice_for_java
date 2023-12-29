package com.leetcode.simple;

import com.leetcode.util.ArrayUtil;

/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2023-12-25 19:15
 */
public class MoveZeroes_283 {

    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        int len = nums.length;
        for(int i = 1;i<len;i++) {
            for(int j = i;j > 0;j--) {
                 if(nums[j] != 0 && nums[j-1] ==0) {
                     ArrayUtil.swap(nums,j,j-1);
                 } else {
                     break;
                 }
            }
        }
    }

    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        new MoveZeroes_283().moveZeroes(nums);
    }


}