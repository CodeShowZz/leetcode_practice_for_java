package com.leetcode;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.*;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-14 15:19
 */
public class GroupAnagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> strToAnagramsMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            strToAnagramsMap.computeIfAbsent(sort(strs[i]),item ->  new ArrayList<>()).add(strs[i]);
        }
        for (Map.Entry<String, List<String>> entry : strToAnagramsMap.entrySet()) {
            res.add(entry.getValue());
        }
        return res;
    }

    private String sort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }


}