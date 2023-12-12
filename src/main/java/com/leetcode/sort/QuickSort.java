package com.leetcode.sort;

import com.leetcode.util.ArrayUtil;

import java.util.Arrays;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-12 17:26
 */
public class QuickSort {

    public static void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int partition = partition(nums, left, right);
            quickSort(nums, left, partition-1);
            quickSort(nums, partition + 1, right);
        }

    }

    public static int partition(int[] nums, int left, int right) {
        int first = left - 1;
        int second = left;
        int pivot = nums[right];
        while (second <= right) {
            if (nums[second] < pivot) {
                first++;
                ArrayUtil.swap(nums, second, first);
            }
            second++;
        }
        ArrayUtil.swap(nums, right, first+1);
        return first + 1;
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 12, 10, 9, 1};

        QuickSort.quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }

}