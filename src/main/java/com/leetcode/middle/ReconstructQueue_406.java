package com.leetcode.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-08 1:40
 */
public class ReconstructQueue_406 {

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o2[0] - o1[0];
            }
            return o1[1] - o2[1];
        });
        List<int[]> resList = new ArrayList<>();
        for (int[] p : people) {
            if (p[1] >= resList.size()) {
                resList.add(p);
            } else {
                resList.add(p[1], p);
            }
        }
        int[][] res = new int[people.length][2];
        for (int i = 0; i < resList.size(); i++) {
            res[i][0] = resList.get(i)[0];
            res[i][1] = resList.get(i)[1];
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int [][] res = new ReconstructQueue_406().reconstructQueue(people);
    }
}