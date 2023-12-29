package com.leetcode.simple;

/**
 * @description: 示例 2：
 * <p>
 * 输入：n = 5
 * 输出：[0,1,1,2,1,2]
 * 解释：
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 4 --> 100
 * 5 --> 101
 * @author: Linhuang
 * @date: 2023-12-20 16:51
 */
public class CountBits_338 {

    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        res[0] = 0;
        if(n == 0) {
            return res;
        }
        res[1] = 1;
        for (int i = 2; i <= n; i++) {
            if(i % 2 == 0) {
                res[i] = res[i / 2];
            } else {
                res[i] = res[i-1] + 1;
            }
        }
        return res;
    }
}