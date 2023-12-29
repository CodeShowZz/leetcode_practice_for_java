package com.leetcode.middle;

import com.leetcode.model.ListNode;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-13 17:40
 */
public class DetectCycle_142 {

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
           fast = fast.next.next;
           slow = slow.next;
           if(fast == slow) {
               break;
           }
        }
        if(fast == null || fast.next == null) {
            return null;
        }
        fast = head;
        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}