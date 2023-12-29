package com.leetcode.middle;

import com.leetcode.model.ListNode;

/**
 * 3.19
 */
public class AddTwoNumbers_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        ListNode head = new ListNode();
        ListNode current = head;
        boolean addOneFlag = false;
        while(l1 != null || l2 != null) {
            int sum = 0;
            if(l1 != null && l2 != null) {
                sum = l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            } else if(l1 != null) {
                l1 = l1.next;
                sum = l1.val;
            } else if(l2 != null) {
                l2 = l2.next;
                sum = l2.val;
            }
            if(addOneFlag) {
                sum = sum + 1;
                addOneFlag = false;
            }
            if(sum >= 10) {
                addOneFlag = true;
            }
            ListNode newNode = new ListNode(sum);
            current.next = newNode;
            current = newNode;
        }
        return head.next;
    }
}
