package com.leetcode.simple;

import com.leetcode.model.ListNode;

import java.util.List;

/**
 * @author lin
 * @date 2023/12/24 5:38
 **/
public class ReverseList_206 {

    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode last = null;
        ListNode current = head;
        while(current != null) {
            ListNode next = current.next;
            current.next = last;
            last = current;
            current = next;
        }
        return last;
    }
}
