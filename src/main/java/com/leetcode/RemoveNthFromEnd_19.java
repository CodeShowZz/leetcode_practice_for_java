package com.leetcode;

import com.leetcode.model.ListNode;

/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2023-12-20 15:30
 */
public class RemoveNthFromEnd_19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n < 1) {
            return head;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode fast = dummy;
        //1-2-3-4-5
        ListNode slow = dummy;
        for(int i = 0;i<n;i++) {
            fast = fast.next;
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}