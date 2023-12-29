package com.leetcode.middle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lin
 * @date 2023/12/24 3:22
 **/
public class LetterCombinations_17 {

        Map<Character, String> phoneMap = new HashMap<>();

        {
            phoneMap.put('1', "");
            phoneMap.put('2', "abc");
            phoneMap.put('3', "def");
            phoneMap.put('4', "ghi");
            phoneMap.put('5', "jkl");
            phoneMap.put('6', "mno");
            phoneMap.put('7', "pqrs");
            phoneMap.put('8', "tuv");
            phoneMap.put('9', "wxyz");
        }

        public List<String> letterCombinations(String digits) {
            List<String> res = new ArrayList<>();
            if (digits == null || digits.length() == 0) {
                return res;
            }
            StringBuilder temp = new StringBuilder();
            dfs(digits, temp, res, 0);
            return res;
        }

        public void dfs(String digits, StringBuilder temp, List<String> res, int index) {
            if(index == digits.length()) {
                res.add(temp.toString());
                return;
            }
            char ch = digits.charAt(index);
            String strs = phoneMap.get(ch);
            for (int i = 0; i < strs.length(); i++) {
                temp.append(strs.charAt(i));
                dfs(digits,temp,res,index+1);
                temp.deleteCharAt(temp.length()-1);
            }
        }
}
