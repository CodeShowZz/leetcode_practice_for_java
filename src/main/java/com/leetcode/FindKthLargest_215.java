package com.leetcode;

import java.util.Arrays;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-27 17:35
 */
public class FindKthLargest_215 {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
//        int count = 1;
//        int len = nums.length;
//        for (int i = len - 2; i >= 0; i--) {
//            if(nums[i] == nums[i+1]) {
//                continue;
//            }
//            count++;
//            if(count == k) {
//                return nums[i];
//            }
//        }
//        return 0;
    }

    public static void main(String[] args) {
        int [] nums = {3,2,3,1,2,4,5,5,6};
        // 6 5 5 4 3 3 2 2 1
        int res = new FindKthLargest_215().findKthLargest(nums,4);
        System.out.println(res);
    }
}