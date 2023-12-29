package com.leetcode.simple;

import com.leetcode.model.ListNode;

import java.util.List;

/**
 * @author lin
 * @date 2023/12/24 3:36
 **/
public class MergeTwoLists_21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }
        ListNode head = new ListNode();
        ListNode current = head;
        while (list1 != null || list2 != null) {
            if(list1 != null && list2 != null) {
                if(list1.val > list2.val) {
                    current.next = list2;
                    list2 = list2.next;
                    current = current.next;
                } else {
                    current.next = list1;
                    list1 = list2.next;
                    current = current.next;
                }
            } else if(list1 != null) {
                current.next = list1;
                break;
            } else if(list2 != null) {
                current.next = list2;
                break;
            }
        }
        return head.next;
    }

}
