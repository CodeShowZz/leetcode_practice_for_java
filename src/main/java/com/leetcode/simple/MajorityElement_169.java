package com.leetcode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lin
 * @date 2023/12/24 5:31
 **/
public class MajorityElement_169 {

    public int majorityElement(int[] nums) {
        int len = nums.length;
        int majority = len / 2;
        Map<Integer,Integer> numToCountMap = new HashMap<>();
        for(int i = 0;i<len;i++) {
             if(numToCountMap.get(nums[i]) == null) {
                 numToCountMap.put(nums[i],1);
             } else {
                 numToCountMap.put(nums[i],numToCountMap.get(nums[i])+1);
             }
        }
        for(Map.Entry<Integer,Integer> entry : numToCountMap.entrySet()) {
            if(entry.getValue() > majority) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
