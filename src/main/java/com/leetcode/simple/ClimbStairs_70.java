package com.leetcode.simple;

/**
 * @author lin
 * @date 2023/12/24 4:17
 * 1 2 3 5 8 13
 **/
public class ClimbStairs_70 {

    public int climbStairs(int n) {
        if(n == 0) {
            return 0;
        }
        int p = 0;
        int q = 1;
        int r = 1;
        for(int i =0;i<n;i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return q;

    }


}
