package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-20 17:26
 */
public class GenerateParenthesis_22 {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(res,"" ,n, n);
        return res;
    }

    public void dfs(List<String> res, String temp, int left, int right) {
        if (left > right) {
            return;
        }
        if (left == 0 && left == right) {
            res.add(temp);
            return;
        }
        if(left != 0) {
            dfs(res, temp + "(", left-1, right);
        }
        if(right != 0) {
            dfs(res, temp + ")", left, right-1);
        }
    }

    public static void main(String[] args) {
        new GenerateParenthesis_22().generateParenthesis(2);
    }
}