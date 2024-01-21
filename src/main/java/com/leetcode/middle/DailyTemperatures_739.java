package com.leetcode.middle;

import java.util.*;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-29 14:44
 */
public class DailyTemperatures_739 {

    /**
     * 示例 1:
     * <p>
     * 输入: temperatures = [73,74,75,71,69,72,76,73]
     * <p>
     * <p>
     * <p>
     * 输出: [1,1,4,2,1,1,0,0]
     *
     * @param temperatures
     * @return
     */
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];
        LinkedList<int[]> stack = new LinkedList<>();
        stack.push(new int[]{0,temperatures[0]});
        for(int i = 1 ; i < len; i++) {
            while(!stack.isEmpty() && stack.peek()[1] < temperatures[i]) {
                int [] pop = stack.pop();
                res[pop[0]] = i - pop[0];
            }
            stack.push(new int[]{i,temperatures[i]});
        }
        return res;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] res = new DailyTemperatures_739().dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(res));
    }
}
