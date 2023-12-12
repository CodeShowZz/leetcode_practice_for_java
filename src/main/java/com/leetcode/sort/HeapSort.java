package com.leetcode.sort;

import com.leetcode.util.ArrayUtil;

import java.util.Arrays;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-12 16:58
 */
public class HeapSort {

    public static void heapSort(int[] nums) {
        buildMaxHeap(nums);
        int i = nums.length - 1;
        while (i >= 0) {
            ArrayUtil.swap(nums, 0, i);
            heapify(nums, 0, i);
            i--;
        }
    }


    public static void buildMaxHeap(int[] nums) {
        int len = nums.length;
        for (int i = len / 2 - 1; i >= 0; i--) {
            heapify(nums, i, len);
        }
    }

    public static void heapify(int[] nums, int i, int len) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < len && nums[left] > nums[largest]) {
            largest = left;
        }
        if (right < len && nums[right] > nums[largest]) {
            largest = right;
        }
        if (largest != i) {
            ArrayUtil.swap(nums, largest, i);
            heapify(nums, largest, len);
        }
    }


    public static void main(String[] args) {
        int[] arr = {6, 5, 12, 10, 9, 1};

        HeapSort.heapSort(arr);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
}