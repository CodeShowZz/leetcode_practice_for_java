package com.leetcode.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-08 14:21
 */
public class FindAnagrams_438 {

    public List<Integer> findAnagrams(String s, String p) {
        int pLen = p.length();
        String sortP = sort(p);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= s.length() - pLen; i++) {
            String subStr = s.substring(i, i + pLen);
            if (sortP.equals(sort(subStr))) {
                res.add(i);
            }
        }
        return res;
    }

    public String sort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        List<Integer> res = new FindAnagrams_438().findAnagrams(s, p);
        System.out.println(res);
    }
}