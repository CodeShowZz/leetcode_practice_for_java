package com.leetcode.middle;

import java.util.*;

/**
 * @author lin
 * @date 2023/12/30 2:13
 **/
public class TopKFrequent_347 {


    public int [] topKFrequent(int[] nums, int k) {
        // 使用字典，统计每个元素出现的次数，元素为键，元素出现的次数为值
        HashMap<Integer,Integer> map = new HashMap();
        for(int num : nums){
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }




        // 遍历map，用最小堆保存频率最大的k个元素
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(map::get));
        for (Integer key : map.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else if (map.get(key) > map.get(pq.peek())) {
                pq.remove();
                pq.add(key);
            }
        }
        // 取出最小堆中的元素
        int [] res = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            res[i] = (pq.remove());
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3,3,3,3,3};
        int [] res = new TopKFrequent_347().topKFrequent(nums,2);
        System.out.println(Arrays.toString(res));
    }
}
