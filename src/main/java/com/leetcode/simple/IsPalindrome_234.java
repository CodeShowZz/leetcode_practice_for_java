package com.leetcode.simple;

import com.leetcode.model.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-25 19:11
 */
public class IsPalindrome_234 {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode current  = head;
        List<Integer> numList = new ArrayList<>();
        while(current != null) {
            numList.add(current.val);
            current = current.next;
        }
        int left = 0;
        int right = numList.size()-1;
        while(left <= right) {
            if(!Objects.equals(numList.get(left),numList.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}