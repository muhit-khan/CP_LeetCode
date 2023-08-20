/*
 * [24] Swap Nodes in Pairs
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */



class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;
        ListNode prev = null;

        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;

            if (prev != null) {
                prev.next = second;
            }

            first.next = second.next;
            second.next = first;

            prev = first;
            head = first.next;
        }

        return newHead;
    }
}
