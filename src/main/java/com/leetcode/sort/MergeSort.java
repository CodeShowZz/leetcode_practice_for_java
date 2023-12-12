package com.leetcode.sort;

import java.util.Arrays;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-12 16:42
 */
public class MergeSort {

    public static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            merge(nums, left, mid, right);
        }
    }

    public static void merge(int[] nums, int left, int mid, int right) {
        int leftLen = mid - left + 1;
        int rightLen = right - mid;
        int[] leftArr = new int[leftLen];
        for (int i = 0; i < leftLen; i++) {
            leftArr[i] = nums[left + i];
        }
        int[] rightArr = new int[rightLen];
        for (int i = 0; i < rightLen; i++) {
            rightArr[i] = nums[mid + i + 1];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < leftLen && j < rightLen) {
            if (leftArr[i] > rightArr[j]) {
                nums[k] = rightArr[j];
                j++;
            } else {
                nums[k] = leftArr[i];
                i++;
            }
            k++;
        }
        while (i < leftLen) {
            nums[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightLen) {
            nums[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String args[]) {
        int[] arr = {6, 5, 12, 10, 9, 1};

        MergeSort.mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }

}