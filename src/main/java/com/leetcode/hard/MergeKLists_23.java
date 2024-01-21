package com.leetcode.hard;

import com.leetcode.model.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lin
 * @date 2024/1/20 13:40
 **/
public class MergeKLists_23 {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode();
        if(lists == null || lists.length == 0) {
            return null;
        }
        List<Integer> numList = new ArrayList<>();
        for(ListNode list : lists) {
            if(list == null) {
                continue;
            }
            ListNode head = list;
            while(head != null) {
                numList.add(head.val);
                head = head.next;
            }
        }
        Collections.sort(numList);
        ListNode current = res;
        for(int num : numList) {
            ListNode newNode = new ListNode(num);
            current.next = newNode;
            current = newNode;
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode[] listNodes = {};
        new MergeKLists_23().mergeKLists(listNodes);
    }
}
