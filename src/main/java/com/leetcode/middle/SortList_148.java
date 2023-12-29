package com.leetcode.middle;

import com.leetcode.model.ListNode;

import java.util.*;

/**
 * @author lin
 * @date 2023/12/24 5:16
 **/
public class SortList_148 {

    public ListNode sortList(ListNode head) {
        if(head == null) {
            return head;
        }
        List<Integer> nums = new ArrayList<>();
        ListNode current = head;
        while(current != null) {
            nums.add(current.val);
            current = current.next;
        }
        Collections.sort(nums);
        current = head;
        int i = 0;
        while(current != null) {
            current.val = nums.get(i);
            i++;
            current = current.next;
        }
        return head;
    }
}
