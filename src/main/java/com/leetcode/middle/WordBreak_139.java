package com.leetcode.middle;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-14 11:18
 */
public class WordBreak_139 {

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> memorySet = new HashSet<>();
        StringBuilder temp = new StringBuilder();
        return dfs(s, wordDict, temp, memorySet);
    }

    public boolean dfs(String s, List<String> wordDict, StringBuilder temp, Set<String> memorySet) {
        if (!s.startsWith(temp.toString())) {
            return false;
        }
        if (temp.length() > s.length()) {
            return false;
        } else if (s.length() == (temp.length())) {
            return true;
        }
        for (int i = 0; i < wordDict.size(); i++) {
            String word = wordDict.get(i);
            temp.append(word);
            if (memorySet.contains(temp)) {
                temp.delete(temp.length() - word.length(), temp.length());
                continue;
            }
            memorySet.add(temp.toString());
            if (dfs(s, wordDict, temp, memorySet)) {
                return true;
            }
            temp.delete(temp.length() - word.length(), temp.length());
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "pen");
        new WordBreak_139().wordBreak("applepenapple", list);
    }
}