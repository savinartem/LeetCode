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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result= new int[m][n];
        
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;
        
        while(left<=right && top<=bottom)
        {
            for(int i=left; i<=right;i++)
            {
                result[top][i]=(head==null)? -1 : head.val;
                if(head!=null) { head=head.next; }
            }
            
            for(int i=top+1; i<=bottom;i++)
            {
                result[i][right]=(head==null) ? -1 : head.val;
                if(head!=null){ head=head.next; }
            }
            
            if(top!=bottom)
            {
                for(int i=right-1;i>=left; i--)
                {
                    result[bottom][i]=(head==null) ? -1 : head.val;
                    if(head!=null){ head=head.next; }
                }
            }
            if(left!=right)
            {
                for(int i=bottom-1;i>top; i--)
                {
                    result[i][left]=(head==null) ? -1 : head.val;
                    if(head!=null)
                    {
                        head=head.next;
                    }
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return result;
        
    }
}