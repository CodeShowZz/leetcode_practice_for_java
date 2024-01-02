package com.leetcode.middle;

import java.util.*;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-02 11:22
 */
public class CalcEquation_399 {


    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int equationSize  = equations.size();
        UnionFind unionFind = new UnionFind(equationSize * 2);
        Map<String,Integer> hashMap = new HashMap<>(2 * equationSize);
        int id = 0 ;
        for(int i = 0 ;  i <equationSize;i++) {
            List<String> equation = equations.get(i);
            String str1 = equation.get(0);
            String str2 = equation.get(1);

            if(!hashMap.containsKey(str1)) {
                hashMap.put(str1,id);
                id++;
            }

            if(!hashMap.containsKey(str2)) {
                hashMap.put(str2,id);
                id++;
            }
            unionFind.union(hashMap.get(str1),hashMap.get(str2),values[i]);
        }

        int querySize = queries.size();
        double [] res = new double[querySize];
        for(int i = 0 ; i <querySize;i++) {
            List<String> query = queries.get(i);
            String str1 = query.get(0);
            String str2 = query.get(1);
            Integer id1 = hashMap.get(str1);
            Integer id2 = hashMap.get(str2);

            if(id1 == null || id2 == null) {
                res[i] = -1;
            } else {
                res[i] = unionFind.isConnect(id1,id2);
            }
        }
        return res;
    }



    private class UnionFind {

        private int[] parent;

        private double[] weight;

        public UnionFind(int n) {
            this.parent = new int[n];
            this.weight = new double[n];
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
            if(rootX == rootY) {
                return weight[x] / weight[y];
            } else {
                return -1.0;
            }
        }
    }

    public static void main(String[] args) {

        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("b", "c"));
        equations.add(Arrays.asList("bc", "cd"));
        double[] values = {1.5,2.5,5.0};
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "b"));
        queries.add(Arrays.asList("b", "a"));
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("x", "y"));
        new CalcEquation_399().calcEquation(equations, values, queries);

    }
}