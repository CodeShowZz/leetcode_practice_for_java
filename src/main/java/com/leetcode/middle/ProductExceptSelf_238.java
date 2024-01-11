package com.leetcode.middle;

/**
 * @author lin
 * @date 2024/01/03 15:54
 **/
public class ProductExceptSelf_238 {

    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int current = 1;
        for (int i = 0; i < len; i++) {
            res[i] = current;
            current = current * nums[i];
        }
        current = 1;
        for (int i = len - 1; i >= 0; i--) {
            res[i] = res[i] * current;
            current = current * nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        new ProductExceptSelf_238().productExceptSelf(nums);
    }
}
