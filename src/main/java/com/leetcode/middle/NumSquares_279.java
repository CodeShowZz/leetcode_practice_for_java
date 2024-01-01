package com.leetcode.middle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author lin
 * @date 2023/12/31 18:59
 **/
public class NumSquares_279 {

    int minSize = Integer.MAX_VALUE;

    public int numSquares(int n) {
        int sqrt = (int)Math.sqrt(n);
        int target = n;
        List<Integer> temp  = new ArrayList<>();
        dfs(sqrt,target,temp);
        return minSize;
    }

    public void dfs(int sqrt,int target,List<Integer> temp) {
        if(target < 0) {
            return;
        } else if(target == 0) {
            minSize = temp.size();
            return;
        }
        if(temp.size() >= minSize) {
            return;
        }
        for(int i = sqrt;i >= 1;i--) {
            temp.add(i);
            dfs(i,target-i*i,temp);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        new NumSquares_279().numSquares(12);
    }
}