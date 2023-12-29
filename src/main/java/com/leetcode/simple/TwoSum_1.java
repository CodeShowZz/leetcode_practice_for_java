package com.leetcode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lin
 * @date 2023/12/24 3:06
 **/
public class TwoSum_1 {

    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return null;
        }
        Map<Integer,Integer> numToIndexMap = new HashMap<>();
        for(int i = 0;i < nums.length;i++) {
            if(numToIndexMap.get(target-nums[i]) != null) {
                return new int[]{i,numToIndexMap.get(target-nums[i])};
            } else {
                numToIndexMap.put(nums[i],i);
            }
        }
        return null;
    }
}
