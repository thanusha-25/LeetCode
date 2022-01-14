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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // if(n==1 && head.next==null)
        //     return null;
        ListNode tmp=head;
        while(n-1>0)
        {
            tmp=tmp.next;
            n--;
        }
        ListNode tmp1=head;
        while(tmp.next!=null && tmp.next.next!=null)
        {
            tmp=tmp.next;
            tmp1=tmp1.next;
        }
        if(tmp.next==null)
        {
            return head.next;
        }
        tmp1.next=tmp1.next.next;
        return head;
    }
}