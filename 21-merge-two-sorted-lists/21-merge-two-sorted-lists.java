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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode ans,other,result;
        if(list1.val<=list2.val)
        {
            result=list1;
            ans=list1;
            other=list2;
        }
        else
        {
            result=list2;
            ans=list2;
            other=list1;
        }
        while(ans!=null && other!=null && ans.next!=null && other.next!=null)
        {
            if(ans.next.val>other.val)
            {
                while(ans.next!=null && other!=null && ans.next.val>other.val)
                {
                    ListNode tmp=ans.next;
                    ans.next=other;
                    other=other.next;
                    ans.next.next=tmp;
                    ans=ans.next;
                }
            }
            else
            ans=ans.next;
        }
        if(other !=null && other.next==null)
        {
            while(ans.next!=null && ans.next.val<=other.val)
            {
                ans=ans.next;
            }
            if(ans.next==null)
                ans.next=other;
            else
            {
                ListNode tmp=ans.next;
                ans.next=other;
                other.next=tmp;
            }
        }
        else if(ans.next==null)
            ans.next=other;
        return result;
    }
}