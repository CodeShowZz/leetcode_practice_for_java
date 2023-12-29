package com.leetcode.middle;

import java.util.LinkedHashMap;

/**
 * @description: leetcode 146
 * @author: Linhuang
 * @date: 2023-12-13 17:30
 */
public class LRUCache_146 {

    private int capacity;

    private LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap();

    public LRUCache_146(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!linkedHashMap.containsKey(key)) {
            return -1;
        }
        int oldValue = linkedHashMap.remove(key);
        linkedHashMap.put(key, oldValue);
        return oldValue;
    }

    public void put(int key, int value) {
        if (linkedHashMap.containsKey(key)) {
            linkedHashMap.remove(key);
            linkedHashMap.put(key, value);
        } else {
            if (linkedHashMap.size() == capacity) {
                int oldKey = linkedHashMap.keySet().iterator().next();
                linkedHashMap.remove(oldKey);
                linkedHashMap.put(key, value);
            } else {
                linkedHashMap.put(key, value);
            }
        }
    }
}