package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @description: 示例 1：
 * <p>
 * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出：[[1,6],[8,10],[15,18]]
 * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * @author: Linhuang
 * @date: 2023-12-11 17:01
 */
public class Merge_56 {

    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length < 1 || intervals[0] == null || intervals[0].length < 1) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> tempList = new ArrayList<>();
        int[] temp = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (isInterval(intervals[i], temp)) {
                temp = merge(intervals[i], temp);
            } else {
                tempList.add(temp);
                temp = intervals[i];
            }
        }
        tempList.add(temp);
        int[][] res = new int[tempList.size()][2];
        for (int i = 0; i < tempList.size(); i++) {
            res[i] = tempList.get(i);
        }
        return res;
    }

    public boolean isInterval(int[] interval1, int[] interval2) {
        return !(interval2[1] < interval1[0] || interval1[1] < interval2[0]);
    }

    public int[] merge(int[] interval1, int[] interval2) {
        return new int[]{Math.min(interval1[0], interval2[0]), Math.max(interval1[1], interval2[1])};
    }

    public static void main(String[] args) {
        int [][] intervals = {{1,4},{0,2},{3,5}};
        new Merge_56().merge(intervals);
    }
}