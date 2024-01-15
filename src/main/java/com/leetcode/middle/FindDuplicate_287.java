package com.leetcode.middle;

/**
 * 示例 1：
 * <p>
 * 输入：nums = [1,3,4,2,2]
 * 输出：2
 *
 * @author lin
 * @date 2024/01/04 09:40
 **/
public class FindDuplicate_287 {

    public int findDuplicate(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while(left < right) {
            int mid = (left + right) / 2;
            int count = 0;
            for(int num : nums) {
                if(num <= mid) {
                    count++;
                }
            }
            if(count > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 2, 1, 1};
        new FindDuplicate_287().findDuplicate(nums);
    }
}
