package com.leetcode.middle;

import java.util.*;

/**
 * @author lin
 * @date 2023/01/04 11:37
 **/
public class TopKFrequent_347 {


    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numToCountMap = new HashMap<>();
        for (int num : nums) {
            if (numToCountMap.get(num) == null) {
                numToCountMap.put(num, 1);
            } else {
                numToCountMap.put(num, numToCountMap.get(num) + 1);
            }
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue(Comparator.comparingInt(numToCountMap::get));
        for (Map.Entry<Integer,Integer> entry : numToCountMap.entrySet()) {
            Integer key = entry.getKey();
            if (priorityQueue.size() < k) {
                priorityQueue.add(key);
            } else {
                int topMin = priorityQueue.peek();
                if(numToCountMap.get(key) > numToCountMap.get(topMin)) {
                    priorityQueue.remove();
                    priorityQueue.add(key);
                }
            }
        }
        int [] res = new int[k];
        for(int i = 0 ; i < k;i++) {
            res[i] = priorityQueue.poll();
        }
        return res;

    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 3, 3};
        int[] res = new TopKFrequent_347().topKFrequent(nums, 2);
        System.out.println(Arrays.toString(res));
    }
}
