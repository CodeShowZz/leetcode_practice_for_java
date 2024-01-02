package com.leetcode.middle;

import java.util.LinkedList;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-02 10:29
 */
public class DecodeString_394 {

    public String decodeString(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        StringBuilder res = new StringBuilder();
        LinkedList<Integer> multiStack = new LinkedList();
        LinkedList<String> resStack = new LinkedList<>();
        int multi = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                multiStack.push(multi);
                resStack.push(res.toString());
                res = new StringBuilder();
                multi = 0;
            } else if (ch == ']') {
                Integer multiPop = multiStack.pop();
                StringBuilder temp = new StringBuilder();
                for(int i = 0 ; i < multiPop; i++) {
                    temp.append(res.toString());
                }
                res = new StringBuilder(resStack.pop() + temp.toString());
            } else if ('0' < ch && ch < '9') {
                multi = multi * 10  +  Integer.parseInt(String.valueOf(ch));
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str = "3[a]2[bc]";
        new DecodeString_394().decodeString(str);
    }

}