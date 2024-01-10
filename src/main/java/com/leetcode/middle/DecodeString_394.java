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
        StringBuilder res = new StringBuilder();
        LinkedList<String> resStack = new LinkedList<>();
        LinkedList<Integer> multiStack = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                resStack.push(res.toString());
                multiStack.push(multi);
                multi = 0;
                res = new StringBuilder();
            } else if (ch == ']') {
                int tempMulti = multiStack.pop();
                StringBuilder temp = new StringBuilder();
                for(int i = 0 ; i <tempMulti;i++) {
                    temp.append(res.toString());
                }
                res = new StringBuilder(resStack.pop() + temp.toString());
            } else if (ch <= '9' && ch >= '0') {
                multi = multi * 10 + (ch - '0');
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str = "3[a]2[bc]";
        String res = new DecodeString_394().decodeString(str);
        System.out.println(res);
    }

}