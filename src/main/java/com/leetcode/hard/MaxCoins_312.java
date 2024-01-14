package com.leetcode.hard;

/**
 * @author lin
 * @date 2024/1/13 18:05
 **/
public class MaxCoins_312 {


    public int maxCoins(int[] nums) {
        int len = nums.length;
        int [] points = new int[len+2];
        for(int i = 0 ; i < points.length;i++) {
            if(i == 0 || i == points.length-1) {
                points[i] = 1;
            } else {
                points[i] = nums[i-1];
            }
        }
        int [][] dp = new int[len+2][len+2];
        for(int left = len-1;left>=0;left--) {
            for(int right = left + 1;right<len+2;right++) {
                for(int choose = left+1;choose<right;choose++) {
                    int temp = points[left] * points[right] * points[choose];
                    dp[left][right] = Math.max(dp[left][right],dp[left][choose] + dp[choose][right] + temp);
                   System.out.println("left=" + left +" right= " + right + " choose= " + choose + " temp=" + temp + " max=" + dp[left][right]);
                }
            }
        }
        return dp[0][len+1];
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 8};
        int res = new MaxCoins_312().maxCoins(nums);
        System.out.println(res);
    }
}
