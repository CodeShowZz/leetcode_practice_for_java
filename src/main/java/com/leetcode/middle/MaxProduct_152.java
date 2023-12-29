package com.leetcode.middle;


/**
 * @author lin
 * @date 2023/12/20 22:58
 **/
public class MaxProduct_152 {

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int tempMin = 1;
        int tempMax = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = tempMax;
                tempMax = tempMin;
                tempMin = temp;
            }
            tempMax = Math.max(tempMax, tempMax * nums[i]);
            tempMin = Math.min(tempMin, tempMin * nums[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int res = new MaxProduct_152().maxProduct(nums);
    }
}
