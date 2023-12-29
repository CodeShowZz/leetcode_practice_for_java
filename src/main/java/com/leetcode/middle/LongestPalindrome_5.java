package com.leetcode.middle;

/**
 * @author lin
 * 示例 1：
 * <p>
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * @date 2023/12/20 3:34
 **/

public class LongestPalindrome_5 {

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        int len = s.length();
        int[] max = new int[2];
        for (int i = 0; i < len; i++) {
            int[] odd = centerSpread(s, i, i, len);
            int[] even = centerSpread(s, i, i + 1, len);
            int [] temp = odd[1] > even[1] ? odd : even;
            max = temp[1] > max[1] ? temp : max;
        }
        return s.substring(max[0],max[0]+max[1]);
    }

    public int[] centerSpread(String s, int left, int right, int len) {
        if (left < 0 || right >= len) {
            return new int[]{0,0};
        }
        while (left <= right && left >=0 && right < len) {
            if(s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            } else {
                break;
            }
        }
        return new int[]{left+1,right-left-1};
    }
}
