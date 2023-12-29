package com.leetcode.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lin
 * @date 2023/12/24 3:16
 **/
public class ThreeSum_15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null  || nums.length < 3) {
            return res;
        }
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0;i<len;i++) {
            if(i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i + 1;
            int right = len  - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left < right && nums[left + 1] == nums[left]) {
                        left++;
                    }
                    left++;
                    right--;
                } else if(sum > 0) {
                    right--;
                } else if(sum < 0) {
                    left++;
                }
            }
        }
        return res;
    }
}
