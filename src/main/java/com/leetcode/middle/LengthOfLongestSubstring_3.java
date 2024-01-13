package com.leetcode.middle;

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
        if (s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> chToIndexMap = new HashMap<>();
        int left = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (chToIndexMap.get(ch) != null) {
                left = Math.max(left, chToIndexMap.get(ch) + 1);
            }
            chToIndexMap.put(ch,i);
            max = Math.max(i - left + 1, max);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        new LengthOfLongestSubstring_3().lengthOfLongestSubstring(s);
    }
}
