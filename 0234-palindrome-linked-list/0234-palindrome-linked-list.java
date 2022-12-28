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
    public boolean isPalindrome(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        
        while(head!=null){
            list.add(head);
            head=head.next;
        }
        
        int i=0; 
        int j=list.size()-1;
        
        while(i<j){
            if(list.get(i).val==list.get(j).val){
                i++;
                j--;
            }else{ return false; }
        }
        return true;
    }
}