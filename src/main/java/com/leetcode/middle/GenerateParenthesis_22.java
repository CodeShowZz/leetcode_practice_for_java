package com.leetcode.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lin
 * @date 2023/12/24 3:42
 **/
public class GenerateParenthesis_22 {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if(n < 1) {
            return res;
        }
        dfs(res,n,n,"");
        return res;
    }

    public void dfs(List<String> res,int left,int right,String temp){
        if(left > right) {
            return ;
        }
        if(left == 0 && left == right) {
            res.add(temp);
            return;
        }
        if(left != 0) {
            dfs(res,left-1,right,temp+"(");
        }
        if(right != 0) {
            dfs(res,left,right-1,temp+")");
        }
    }
}
