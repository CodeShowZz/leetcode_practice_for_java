package com.leetcode.simple;

/**
 * @author lin
 * @date 2023/12/24 5:26
 **/
public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for(int i = 1;i<nums.length;i++) {
            res = res ^ nums[i];
        }
        return res;
    }

}
