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
        LinkedList<Integer> temperaturesStack = new LinkedList<>();
        int len = temperatures.length;
        int []res= new int[len];
        for (int i = 0; i < len; i++) {
            if (temperaturesStack.size() == 0) {
                temperaturesStack.push(i);
            } else {
                while (temperaturesStack.size() != 0) {
                    int peek = temperaturesStack.peek();
                    if (temperatures[i] > temperatures[peek]) {
                        int index = temperaturesStack.pop();
                        res[index] = i - peek;
                    } else {
                        break;
                    }
                }
                temperaturesStack.push(i);
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
