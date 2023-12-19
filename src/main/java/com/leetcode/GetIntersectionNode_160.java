package com.leetcode;

import com.leetcode.model.ListNode;

/**
 * @author lin
 * @date 2023/12/20 3:57
 **/
public class GetIntersectionNode_160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode fast = headA;
        ListNode slow = headB;
        while(fast != slow)  {
            if(fast != null) {
                fast = fast.next;
            } else {
                fast = headB;
            }
            if(slow != null) {
                slow = slow.next;
            } else {
                slow = headA;
            }
        }
        return fast;
    }

}
