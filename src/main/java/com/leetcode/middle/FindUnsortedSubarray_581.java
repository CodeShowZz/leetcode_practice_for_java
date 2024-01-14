package com.leetcode.middle;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-11 14:58
 */
public class FindUnsortedSubarray_581 {

    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int right = -1;
        for (int i = 0; i < len; i++) {
            if (nums[i] >= max) {
                max = nums[i];
            } else {
                right = i;
            }
        }
        int min = Integer.MAX_VALUE;
        int left = -1;
        for(int i = len-1;i>=0;i--) {
            if(nums[i] <= min) {
                min = nums[i];
            } else {
                left = i;
            }
        }
        return left == -1 ? 0 : right - left + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3};
        int res = new FindUnsortedSubarray_581().findUnsortedSubarray(nums);
        System.out.println(res);
    }
}