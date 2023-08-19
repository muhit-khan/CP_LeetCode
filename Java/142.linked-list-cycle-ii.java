/*
 * [142] Linked List Cycle II
 */


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<Integer> set = new HashSet<Integer>();
        while(head != null){
            if (set.contains(head.hashCode())) {
                return head;
            }
            set.add(head.hashCode());
            head = head.next;
        }
        return null;
    }
}
