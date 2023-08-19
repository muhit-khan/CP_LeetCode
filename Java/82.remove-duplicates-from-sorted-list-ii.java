/*
 * [82] Remove Duplicates from Sorted List II
 */

import java.util.HashMap;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */




class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode prev = head;
        ListNode curr = head.next;
        map.put(prev.val, 1);

        while (curr != null) {
            map.put(curr.val, map.getOrDefault(curr.val, 0) + 1);
            curr = curr.next;
        }
        
        prev = new ListNode();
        prev.next = head;
        curr = prev;

        while (curr.next != null) {
            if (map.get(curr.next.val) > 1) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return prev.next;
    }
}
