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
        if (temperatures == null || temperatures.length == 0) {
            return temperatures;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int [] res = new int[temperatures.length];
        for(int i = 0 ; i < temperatures.length;i++) {
            if(stack.isEmpty()) {
                stack.push(i);
            } else {
                while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    int index = stack.peek();
                    res[index] = i - index;
                    stack.pop();
                }
                stack.push(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] res = new DailyTemperatures_739().dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(res));
    }
}
