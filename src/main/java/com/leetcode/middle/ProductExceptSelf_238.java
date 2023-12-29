package com.leetcode.middle;

/**
 * @author lin
 * @date 2023/12/30 2:08
 **/
public class ProductExceptSelf_238 {

    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) {
            return nums;
        }
        int len = nums.length;
        int [] res = new int[len];
        int k = 1;
        for(int i = 0 ; i < len;i++ ) {
            res[i] = k;
            k = k * nums[i];
        }
        k = 1;
        for(int i = len-1;i>=0;i--) {
            res[i] = res[i] * k;
            k = k * nums[i];
        }
        return  res;
    }
}
