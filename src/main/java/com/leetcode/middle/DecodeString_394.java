package com.leetcode.middle;

import java.util.LinkedList;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-08 10:09
 */
public class DecodeString_394 {

    public String decodeString(String s) {
        int multi = 0;
        LinkedList<Integer> multiStack = new LinkedList();
        StringBuilder res = new StringBuilder();
        LinkedList<String> resStack = new LinkedList<>();
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
                    res.append(temp.toString());
                }
                res = new StringBuilder(resStack.pop() + temp.toString());
            } else if ('0' <= ch && ch <= '9') {
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