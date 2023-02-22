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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head;
        ListNode curr=head;
        ListNode prev=head;
        
        int sum=0;
        
        while(curr!=null)
        {
            if(curr.val!=0)
            {
                sum+=curr.val;
            }
            else
            {
                if(sum!=0)
                {
                    temp.val=sum;
                    sum=0;
                    prev=temp;
                    temp=temp.next;
                }
            }
            curr=curr.next;
        }
        prev.next=null;
        return head;
    }
}