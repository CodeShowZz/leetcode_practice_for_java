package com.leetcode.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-26 16:29
 */
public class CanFinish_207 {

    List<List<Integer>> edges;
    int [] visited;
    boolean valid = true;


    public boolean canFinish(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<>();
        visited = new int[numCourses];
        for(int i = 0 ; i <  numCourses;i++) {
            edges.add(new ArrayList<>());
        }
        for(int [] prerequisite : prerequisites) {
            edges.get(prerequisite[1]).add(prerequisite[0]);
        }
        for(int i = 0;i<numCourses;i++) {
            if(!valid) {
                return false;
            }
            if(visited[i] == 0) {
                dfs(i);
            }
        }
        return true;
    }

    public void dfs(int u) {
        visited[u] = 1;
        for(int v : edges.get(u)) {
            if(visited[v] == 0) {
                dfs(v);
                if(!valid) {
                    return;
                }
            } else if(visited[v] == 1) {
                valid = false;
                return;
            }
        }
        visited[u] = 2;
    }


    public static void main(String[] args) {
        int numCourse = 7;
        int [][] prerequisites =  {{2,0},{5,0}, {4,0},{0,1},{2,1},{5,3},{4,5},{6,5}};
        boolean valid = new CanFinish_207().canFinish(numCourse,prerequisites);
        System.out.println("valid:" + valid);
    }
}