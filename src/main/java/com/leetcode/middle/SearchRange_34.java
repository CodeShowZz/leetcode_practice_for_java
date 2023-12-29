package com.leetcode.middle;

/**
 * @author lin
 * @date 2023/12/24 4:00
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 **/
public class SearchRange_34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        if (nums == null) {
            return res;
        }
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] == target) {
                int temp = mid;
                while (temp > lo && nums[temp] == nums[temp - 1]) {
                    temp = temp - 1;
                }
                res[0] = temp;
                temp = mid;
                while (temp < hi && nums[temp] == nums[temp + 1]) {
                    temp = temp + 1;
                }
                res[1] = temp;
                break;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        new SearchRange_34().searchRange(nums,8);
    }
}
