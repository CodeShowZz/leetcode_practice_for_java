package com.leetcode.middle;

import com.leetcode.util.ArrayUtil;

import java.util.Arrays;

/**
 * @author lin
 * @date 2023/12/24 3:45
 **/
public class NextPermutation_31 {

    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int len = nums.length;
        int i = 0;
        int j = 0;
        int k = 0;
        for (int m = len - 1; m >= 0; m--) {
            if (m > 0 && nums[m] > nums[m - 1]) {
                i = m-1;
                j= m;
                break;
            }
        }
        for(int m = len-1;m>=j;m--) {
            if(nums[m] > nums[i]) {
                swap(nums,m,i);
                break;
            }
        }
        Arrays.sort(nums,j,len);
    }

    public static void swap(int [] nums,int i ,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
