package com.leetcode.middle;

/**
 * @author lin
 * @date 2023/12/20 22:58
 **/
public class MaxProduct_152 {

    public int maxProduct(int[] nums) {
        if(nums ==null || nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int tempMin = 1;
        int tempMax = 1;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] < 0) {
                int temp = tempMax;
                tempMax = tempMin;
                tempMin = temp;
            }
            tempMax = Math.max(nums[i],nums[i] * tempMax);
            tempMin = Math.min(nums[i],nums[i] * tempMin);
            max = Math.max(tempMax,max);
        }
        return max;
    }
}
