package com.leetcode.middle;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-11 14:58
 */
public class FindUnsortedSubarray_581 {

    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int left = -1;
        int right = -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            if(max > nums[i]) {
                right = i;
            } else {
                max = nums[i];
            }
            if(min < nums[len-i-1]) {
                left = len-i-1;
            } else {
                min = nums[len-i-1];
            }
        }
        return right == -1 ? 0 : right - left + 1;
    }

    public static void main(String[] args) {
        int [] nums = {2,6,4,8,10,9,15};
        int res = new FindUnsortedSubarray_581().findUnsortedSubarray(nums);
        System.out.println(res);
    }
}