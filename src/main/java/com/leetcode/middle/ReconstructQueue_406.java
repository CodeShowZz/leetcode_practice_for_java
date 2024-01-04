package com.leetcode.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-03 16:49
 */
public class ReconstructQueue_406 {

    public int[][] reconstructQueue(int[][] people) {
         Arrays.sort(people, (o1, o2) -> {
             if (o1[0] != o2[0]) {
                 return o2[0] - o1[0];
             }
             return o1[1] - o2[1];
         });
        int len = people.length;
        List<int[]> tempResList = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int position = people[i][1];
            if (position > tempResList.size()) {
                tempResList.add(people[i]);
            } else {
                tempResList.add(position, people[i]);
            }
        }
        int [][] res= new int[len][2];
        for(int i = 0;i< tempResList.size();i++) {
            res[i] = tempResList.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int [][]people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        new ReconstructQueue_406().reconstructQueue(people);
    }
}