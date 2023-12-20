package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-20 15:03
 */
public class ThreeSum_15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return res;
        }
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i + 1;
            int right = len - 1;
            while(left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[left], nums[right], nums[i]));
                    while (left < right && nums[left+1] == nums[left]) {
                        left++;
                    }
                    left++;
                    right--;
                } else if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                }
            }
        }
        return res;
    }
}