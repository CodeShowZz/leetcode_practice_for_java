package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2023-12-25 19:24
 */
public class FindDisappearedNumbers_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            return res;
        }
        int len = nums.length;
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums) {
            numSet.add(num);
        }
        for(int i = 1;i<=len;i++) {
            if(!numSet.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}