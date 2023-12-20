package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2023-12-20 15:14
 */
public class LetterCombinations_17 {

    Map<Character,String> phoneMap = new HashMap<>();
    {
        phoneMap.put('2',"abc");
        phoneMap.put('3',"def");
        phoneMap.put('4',"ghi");
        phoneMap.put('5',"jkl");
        phoneMap.put('6',"mno");
        phoneMap.put('7',"pqrs");
        phoneMap.put('8',"tuv");
        phoneMap.put('9',"wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0) {
            return res;
        }
        StringBuilder temp = new StringBuilder();
        dfs(res,digits,0,temp);
        return res;
    }

    public void dfs(List<String> res,String digits,int index,StringBuilder temp) {
        if(index == digits.length()) {
            res.add(temp.toString());
            return;
        }
        char ch = digits.charAt(index);
        String letters = phoneMap.get(ch);
        for(int i = 0;i<letters.length();i++) {
            temp.append(letters.charAt(i));
            dfs(res,digits,index+1,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }

    public static void main(String[] args) {
        new LetterCombinations_17().letterCombinations("23");
    }
}