package com.leetcode;

import java.util.LinkedList;

/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2023-12-25 19:32
 */
public class MinStack_155 {

    private LinkedList<Integer> stack;

    private LinkedList<Integer> minStack;

    public MinStack_155() {
        stack  = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int val) {
        stack.push(val);
        if(minStack.size() == 0) {
            minStack.push(val);
         } else {
            minStack.push(Math.min(val, minStack.peekFirst()));
        }
    }

    public void pop() {
        if(stack.size() > 0) {
            stack.pop();
            minStack.pop();
        }
    }

    public int top() {
        if(stack.size() > 0) {
            return stack.peekFirst();
        }
        return -1;
    }

    public int getMin() {
        if(minStack.size() > 0) {
           return minStack.peekFirst();
        }
        return -1;
    }

    public static void main(String[] args) {
        MinStack_155 minStack = new MinStack_155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int min = minStack.getMin();   // 返回 -3.
        minStack.pop();
        int top = minStack.top();      // 返回 0.
        min = minStack.getMin();   // 返回 -2.
    }

}