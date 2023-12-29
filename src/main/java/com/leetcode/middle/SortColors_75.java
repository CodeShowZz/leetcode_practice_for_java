package com.leetcode.middle;

import com.leetcode.util.ArrayUtil;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-13 16:07
 */
public class SortColors_75 {

    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int left = 0;
        int zero = left;
        int two = nums.length;
        while (left < two) {
            if (nums[left] == 0) {
                ArrayUtil.swap(nums, left, zero);
                left++;
                zero++;
            } else if (nums[left] == 1) {
                left++;
            } else if (nums[left] == 2) {
                two--;
                ArrayUtil.swap(nums, left, two);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        new SortColors_75().sortColors(nums);
    }
}