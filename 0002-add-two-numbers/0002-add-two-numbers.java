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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode= new ListNode(0);
        ListNode l3=resultNode;

        int carry=0;
        while(l1!=null || l2!=null){
            int l1Val=0;
            if(l1!=null){l1Val=l1.val; }
            int l2Val=0;
            if(l2!=null){ l2Val=l2.val; }

            int currentSum=l1Val+l2Val+carry;
            carry=currentSum/10;
            int lastDigit=currentSum%10;

            ListNode newNode=new ListNode(lastDigit);
            l3.next=newNode;

            if(l1!=null){ l1=l1.next; }
            if(l2!=null){ l2=l2.next; }
            l3=l3.next;

        }
        if(carry>0){
            ListNode newNode=new ListNode(carry);
            l3.next=newNode;
            l3=l3.next;
        }
        return resultNode.next;
    }
}