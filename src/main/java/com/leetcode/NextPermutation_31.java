package com.leetcode;

import com.leetcode.util.ArrayUtil;

import java.util.Arrays;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-20 17:39
 */
public class NextPermutation_31 {

    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int len = nums.length;
        int i = 0;
        int j = 0;
        for (int m = len - 1; m >= 1; m--) {
            if (nums[m-1] < nums[m]) {
                i = m-1;
                j = m;
                break;
            }
        }
        int k =0;
        for(int m = len - 1;m>=j;m--) {
            if(nums[m] > nums[i]) {
                k = m;
                break;
            }
        }
        ArrayUtil.swap(nums,i,k);
        Arrays.sort(nums,j,len);
    }
}