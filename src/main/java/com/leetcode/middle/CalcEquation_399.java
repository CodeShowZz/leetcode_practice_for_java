package com.leetcode.middle;

import java.util.*;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-02 11:22
 */
public class CalcEquation_399 {


    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int equationSize = equations.size();
        Map<String, Integer> strToIndexMap = new HashMap<>();
        UnionFind unionFind = new UnionFind(2 * equationSize);
        int index = 0;
        for (int i = 0; i < equationSize; i++) {
            List<String> equation = equations.get(i);
            String str1 = equation.get(0);
            if (!strToIndexMap.containsKey(str1)) {
                strToIndexMap.put(str1, index);
                index++;
            }
            String str2 = equation.get(1);
            if (!strToIndexMap.containsKey(str2)) {
                strToIndexMap.put(str2, index);
                index++;
            }
            unionFind.union(strToIndexMap.get(str1), strToIndexMap.get(str2), values[i]);
        }
        int querySize = queries.size();
        double[] res = new double[querySize];
        for (int i = 0; i < querySize; i++) {
            List<String> query = queries.get(i);
            String str1 = query.get(0);
            String str2 = query.get(1);
            Integer index1 = strToIndexMap.get(str1);
            Integer index2 = strToIndexMap.get(str2);
            if (index1 == null || index2 == null) {
                res[i] = -1.0;
            } else {
                res[i] = unionFind.isConnect(index1,index2);
            }
        }
        return res;
    }


    private class UnionFind {

        private int[] parents;

        private double[] weights;

        public UnionFind(int n) {
            parents = new int[n];
            weights = new double[n];
            for (int i = 0; i < n; i++) {
                parents[i] = i;
                weights[i] = 1.0;
            }
        }

        public void union(int x, int y, double value) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }
            parents[rootX] = rootY;
            weights[rootX] = weights[y] * value / weights[x];
        }

        public int find(int x) {
            if (x != parents[x]) {
                int origin = parents[x];
                parents[x] = find(parents[x]);
                weights[x] = weights[x] * weights[origin];
            }
            return parents[x];
        }

        public double isConnect(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                return -1.0;
            } else {
                return weights[x] / weights[y];
            }
        }
    }

    public static void main(String[] args) {

        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("b", "c"));
//        equations.add(Arrays.asList("bc", "cd"));
        double[] values = {2.0,3.0};
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("b", "a"));
        queries.add(Arrays.asList("a", "e"));
        queries.add(Arrays.asList("a", "a"));
        queries.add(Arrays.asList("x", "x"));
       double [] res= new CalcEquation_399().calcEquation(equations, values, queries);
        System.out.println(Arrays.toString(res));
    }
}