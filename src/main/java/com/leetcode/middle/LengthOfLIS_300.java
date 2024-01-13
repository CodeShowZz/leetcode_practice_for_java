package com.leetcode.middle;

/**
 * @author lin
 * @date 2023/01/04 10:15
 **/
public class LengthOfLIS_300 {

    public int lengthOfLIS(int[] nums) {
       int len = nums.length;
       if(len == 1) {
           return 1;
       }
       int max = 1;
       int [] dp = new int[len];
       dp[0] = 1;
       for(int i = 1;i < len;i++) {
           dp[i] = 1;
           for(int j = 0 ; j < i ; j++) {
               if(nums[j] < nums[i]) {
                   dp[i] = Math.max(dp[i],dp[j] + 1);
               }
           }
           max = Math.max(dp[i],max);
       }
       return max;
    }
}
