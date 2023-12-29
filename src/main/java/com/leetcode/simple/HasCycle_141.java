package com.leetcode.simple;

import com.leetcode.model.ListNode;

/**
 * @author lin
 * @date 2023/12/24 4:50
 **/
public class HasCycle_141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        if(fast != null) {
            fast = fast.next;
        }
        while(fast != slow) {
            if(fast != null) {
                fast = fast.next;
            } else {
                return false;
            }
            if(fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return true;
    }

}
