package com.leetcode.middle;

/**
 * @author lin
 * @date 2023/12/31 19:34
 **/
public class FindDuplicate_287 {

    public int findDuplicate(int[] nums) {
        int len = nums.length; // n + 1 = len, n = len - 1

        // 在 [1..n] 查找 nums 中重复的元素
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            // nums 中小于等于 mid 的元素的个数
            int count = 0;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }
            if (count > mid) {
                // 下一轮搜索的区间 [left..mid]
                right = mid;
            } else {
                // 下一轮搜索的区间 [mid + 1..right]
                left = mid + 1;
            }
        }
        return left;
    }
}
