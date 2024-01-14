package com.leetcode.middle;


/**
 * @author lin
 * @date 2024/1/14 1:58
 **/
public class MaxProduct_152 {

    public int maxProduct(int[] nums) {
        int len = nums.length;
        int tempMax = nums[0];
        int tempMin = nums[0];
        int max = tempMax;
        for (int i = 1; i < len; i++) {
            int iTempMax = tempMax;
            int iTempMin = tempMin;
            tempMax = Math.max(Math.max(iTempMax * nums[i], iTempMin * nums[i]), nums[i]);
            tempMin = Math.min(Math.min(iTempMin * nums[i], iTempMax * nums[i]), nums[i]);
            max = Math.max(max,tempMax);
        }
        return max;

    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int res = new MaxProduct_152().maxProduct(nums);
        System.out.println(res);
    }
}
