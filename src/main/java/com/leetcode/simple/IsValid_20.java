package com.leetcode.simple;

import java.util.LinkedList;

/**
 * @author lin
 * @date 2023/12/24 3:32
 **/
public class IsValid_20 {

    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        LinkedList<Character> linkedList = new LinkedList();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')' || ch == ']' || ch == '}') {
                if(linkedList.isEmpty()) {
                    return false;
                }
                char pop = linkedList.pop();
                if(ch == ')' && pop != '(') {
                    return false;
                } else if(ch == ']' && pop != '[') {
                    return false;
                } else if(ch == '}' && pop != '{') {
                    return false;
                }
            } else {
                linkedList.push(ch);
            }
        }
        if(!linkedList.isEmpty()) {
            return false;
        }
        return true;
    }
}
