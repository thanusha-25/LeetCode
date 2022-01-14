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
    public ListNode reverseList(ListNode node)
    {
        if(node==null || node.next==null)
            return node;
        ListNode prev=null;
        while(node!=null)
        {
            ListNode tmp=node.next;
            node.next=prev;
            prev=node;
            node=tmp;
        }
        return prev;
    }
    
    public void reorderList(ListNode head) {
        if(head.next==null || head.next.next==null)
            return ;
        ListNode first=head,second=head;
        while(second!=null && second.next!=null)
        {
            first=first.next;
            second=second.next.next;
        }
        ListNode endNode=first;
        first=reverseList(first);
        System.out.println(first.val);
        second=head;
        while(second.next!=endNode)
        {
            ListNode tmp=second.next;
            second.next=first;
            first=first.next;
            second.next.next=tmp;
            second=tmp;
        }
        second.next=first;
        // return head;
    }
}