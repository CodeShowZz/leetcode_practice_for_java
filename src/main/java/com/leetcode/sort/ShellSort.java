package com.leetcode.sort;

import com.leetcode.util.ArrayUtil;

import java.util.Arrays;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-12 17:36
 */
public class ShellSort {

    public static void shellSort(int[] nums) {
        int len = nums.length;
        int gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                for (int j = i; j >= gap; j = j - gap) {
                    if (nums[j] < nums[j - gap]) {
                        ArrayUtil.swap(nums, j, j - gap);
                    } else {
                        break;
                    }
                }
            }
            gap = gap / 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 12, 10, 9, 1};

        ShellSort.shellSort(arr);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
}