/*
 *
 * [25] Reverse Nodes in k-Group
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1)return head;

        ListNode temp = new ListNode(0);
        temp.next=head;

        ListNode curr=temp, nex=temp, prev=temp;

        int count=0;
        while(curr.next!=null){
            curr=curr.next;
            count++;
        }

        while(count>=k){
            curr=prev.next;
            nex=curr.next;
            for(int i=1; i<k; i++){
                curr.next=nex.next;
                nex.next=prev.next;
                prev.next=nex;
                nex=curr.next;
            }
            prev=curr;
            count-=k;
        }
        return temp.next;
    }
}
