package com.leetcode;

import java.util.LinkedList;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-20 15:39
 */
public class IsValid_20 {

    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        LinkedList<Character> linkedList = new LinkedList();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                linkedList.push(ch);
            } else {
                if(linkedList.isEmpty()) {
                    return false;
                }
                char pop = linkedList.pop();
                if(ch == ')' && pop != '(') {
                    return false;
                }
                if(ch == ']' && pop != '[') {
                    return false;
                }
                if(ch == '}' && pop != '{') {
                    return false;
                }
            }
        }
        if(linkedList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }


}