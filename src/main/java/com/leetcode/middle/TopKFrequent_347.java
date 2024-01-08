package com.leetcode.middle;

import java.util.*;

/**
 * @author lin
 * @date 2023/01/08 10:58
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
        PriorityQueue<Integer> heap = new PriorityQueue(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return numToCountMap.get(o1) - numToCountMap.get(o2);
            }
        });
        for(Map.Entry<Integer,Integer> entry : numToCountMap.entrySet()) {
            int num = entry.getKey();
            if(heap.size() < k) {
                heap.add(num);
            } else {
                int topMin = heap.peek();
                if(numToCountMap.get(topMin) < numToCountMap.get(num)) {
                    heap.poll();
                    heap.add(num);
                }
            }
        }
        int [] res = new int[k];
        for(int i = 0;i<k;i++) {
            res[i] = heap.poll();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,-1,2,-1,2,3};
        int[] res = new TopKFrequent_347().topKFrequent(nums, 2);
        System.out.println(Arrays.toString(res));
    }
}
