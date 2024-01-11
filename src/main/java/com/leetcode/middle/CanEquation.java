package com.leetcode.middle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lin
 * @date 2024/1/8 4:39
 **/
public class CanEquation {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Integer> strToIndexHashMap = new HashMap<>();
        int equationSize = equations.size();
        UnionField unionField = new UnionField(2 * equationSize);
        int index = 0;
        for(int i = 0 ; i < equationSize;i++){
            List<String> equation = equations.get(i);
            String str1 = equation.get(0);
            if(!strToIndexHashMap.containsKey(str1)) {
                strToIndexHashMap.put(str1,index);
                index++;
            }
            String str2 = equation.get(1);
            if(!strToIndexHashMap.containsKey(str2)) {
                strToIndexHashMap.put(str2,index);
                index++;
            }
            unionField.union(strToIndexHashMap.get(str1),strToIndexHashMap.get(str2),values[i]);
        }
        int querySize = queries.size();
        double [] res = new double[querySize];
        for(int i = 0 ; i < querySize;i++){
            List<String> query = queries.get(i);
            String str1 = query.get(0);
            String str2 = query.get(1);
            Integer index1 = strToIndexHashMap.get(str1);
            Integer index2 = strToIndexHashMap.get(str2);
            if(index1 == null || index2 == null) {
                res[i] = -1.0;
            } else {
                res[i] = unionField.connect(index1,index2);
            }
        }
        return res;
    }

    private class UnionField {

        private int[] parent;

        private double[] weight;

        public UnionField(int n) {
            parent = new int[n];
            weight = new double[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                weight[i] = 1.0;
            }
        }

        public void union(int x, int y, double value) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }
            parent[rootX] = rootY;
            weight[rootX] = weight[y] * value / weight[x];
        }

        public int find(int x) {
            if (x != parent[x]) {
                int origin = parent[x];
                parent[x] = find(parent[x]);
                weight[x] = weight[x] * weight[origin];
            }
            return parent[x];
        }

        public double isConnect(int x,int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                return -1.0;
            }
            return weight[x] / weight[y];
        }


    }
}
