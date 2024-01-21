package com.leetcode.sort;

import java.util.Arrays;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-12 16:42
 */
public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int leftLen = mid - left + 1;
        int rightLen = right - mid;
        int[] leftArr = new int[leftLen];
        for (int i = 0; i < leftLen; i++) {
            leftArr[i] = arr[left + i];
        }
        int[] rightArr = new int[rightLen];
        for (int i = 0; i < rightLen; i++) {
            rightArr[i] = arr[mid + i + 1];
        }
        int l = 0;
        int r = 0;
        int k = left;
        while(l < leftLen && r < rightLen) {
            if(leftArr[l] > rightArr[r]) {
                arr[k] = rightArr[r];
                r++;
            } else {
                arr[k] = leftArr[l];
                l++;
            }
            k++;
        }
        while(l < leftLen) {
            arr[k] = leftArr[l];
            l++;
            k++;
        }
        while(r < rightLen) {
            arr[k] = rightArr[r];
            r++;
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