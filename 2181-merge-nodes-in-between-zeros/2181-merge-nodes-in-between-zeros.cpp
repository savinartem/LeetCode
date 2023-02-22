/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeNodes(ListNode* head) {
        ListNode* temp=head;
        ListNode* curr=head;
        ListNode* prev=head;
        
        int sum;
        
        while(curr!=NULL)
        {
            if(curr->val!=0)
            {
                sum+=curr->val;
            }
            else
            {
                if(sum!=0)
                {
                    temp->val=sum;
                    sum=0;
                    prev=temp;
                    temp=temp->next;
                }
            }
            curr=curr->next;
        }
        prev->next=NULL;
        return head->next;
    }
};