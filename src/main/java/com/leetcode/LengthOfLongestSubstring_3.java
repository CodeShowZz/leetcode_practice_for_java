package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lin
 * @date 2023/12/20 3:26
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 **/
public class LengthOfLongestSubstring_3 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> charToIndexMap = new HashMap<>();
        int len = s.length();
        int maxLen = 0;
        int left = 0;
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if(charToIndexMap.get(ch) != null) {
                left = Math.max(left,charToIndexMap.get(ch)+1);
            }
            maxLen = Math.max(maxLen,(i - left) + 1);
            charToIndexMap.put(ch,i);
        }
        return maxLen;
    }
}
