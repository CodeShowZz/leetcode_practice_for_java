package com.leetcode.middle;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Linhuang
 * @date: 2024-01-03 14:38
 */
public class CanFinish_207 {

    private List<List<Integer>> edges = new ArrayList<>();
    private boolean valid = true;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            edges.get(edge[1]).add(edge[0]);
        }
        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!valid) {
                return false;
            }
            dfs(i, visited);
        }
        return valid;
    }

    public void dfs(int v, int[] visited) {
        visited[v] = 1;
        List<Integer> prerequisites = edges.get(v);
        for (int prerequisite : prerequisites) {
            if (visited[prerequisite] == 0) {
                dfs(prerequisite,visited);
                if(!valid) {
                    return;
                }
            } else if (visited[prerequisite] == 1) {
                valid = false;
                return;
            }
        }
        visited[v] = 2;
    }


    public static void main(String[] args) {
        int numCourse = 7;
        int[][] prerequisites = {{2, 0}, {5, 0}, {4, 0}, {0, 1}, {2, 1}, {5, 3}, {4, 5}, {6, 5}};
        boolean valid = new CanFinish_207().canFinish(numCourse, prerequisites);
        System.out.println("valid:" + valid);
    }
}