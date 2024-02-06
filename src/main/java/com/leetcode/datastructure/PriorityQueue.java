package com.leetcode.datastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lin
 * @date 2024/1/27 0:48
 **/
public class PriorityQueue {

    public List<Integer> list = new ArrayList<>();


    public void insert(Integer num) {
        if (list.isEmpty()) {
            list.add(num);
        } else {
            list.add(num);
            int size = list.size();
            for (int i = size / 2 - 1; i >= 0; i--) {
                heapify(list, i, size);
            }
        }
    }

    public boolean delete(Integer num) {
        if (list.isEmpty()) {
            return false;
        }
        Integer temp = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).equals(num)) {
                temp = i;
                break;
            }
        }
        if (temp == null) {
            return false;
        }
        int last = list.get(size - 1);
        list.set(temp, last);
        list.remove(size - 1);
        heapify(list, temp, list.size());
        return true;
    }

    public void heapify(List<Integer> list, int i, int len) {
        int largest = i;
        int left = 2 * i + 1;
        if (left < len && list.get(left) > list.get(largest)) {
            largest = left;
        }
        int right = 2 * i + 2;
        if (right < len && list.get(right) > list.get(largest)) {
            largest = right;
        }
        if (i != largest) {
            int temp = list.get(i);
            list.set(i, list.get(largest));
            list.set(largest, temp);
            heapify(list, largest, len);
        }
    }

    public Integer peek() {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    public Integer pop() {
        if (list.isEmpty()) {
            return null;
        } else {
            int size = list.size();
            int last = list.get(size - 1);
            int pop = list.get(0);
            list.set(0, last);
            list.remove(size - 1);
            heapify(list, 0, list.size());
            return pop;
        }
    }

    public int getSize() {
        return list.size();
    }

    public void print() {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void main(String args[]) {

        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.insert(3);
        priorityQueue.insert(4);
        priorityQueue.insert(9);
        priorityQueue.insert(5);
        priorityQueue.insert(2);

        System.out.println("Max-Heap array: ");
        priorityQueue.print();

        boolean res = priorityQueue.delete(5);
        System.out.println(res);
        System.out.println("After deleting an element: ");
        priorityQueue.print();
        while(priorityQueue.getSize() != 0) {
            Integer pop = priorityQueue.pop();
            System.out.println("pop: " +pop);
            priorityQueue.print();
        }
        priorityQueue.print();
    }
}
