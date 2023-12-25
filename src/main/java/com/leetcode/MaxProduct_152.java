package com.leetcode;

import com.leetcode.util.ArrayUtil;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-20 18:07
 */
public class MaxProduct_152 {

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int tempMax = 1;
        int tempMin = 1;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if(nums[i] < 0) {
                int temp = tempMax;
                tempMax = tempMin;
                tempMin = temp;
            }
            tempMax = Math.max(tempMax,tempMax*nums[i]);
            tempMin = Math.min(tempMin,tempMin*nums[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int res = new MaxProduct_152().maxProduct(nums);
    }
}