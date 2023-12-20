package com.leetcode;

import com.leetcode.model.ListNode;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-20 16:45
 */
public class MergeTwoLists_21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val > list2.val) {
                    ListNode newNode = new ListNode(list2.val);
                    current.next = newNode;
                    current = newNode;
                    list2 = list2.next;
                } else {
                    ListNode newNode = new ListNode(list1.val);
                    current.next = newNode;
                    current = newNode;
                    list1 = list1.next;
                }
            } else if (list1 == null) {
                current.next = list2;
                break;
            } else if (list2 == null) {
                current.next = list1;
                break;
            }
        }
        return dummy.next;
    }
}