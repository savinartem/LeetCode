/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        //using stack DataStructure
        Stack<TreeNode>stack= new Stack<>();
        
        List<Integer> outputArr= new ArrayList<>();
        
        if(root==null){
            return outputArr;
        }
        
        TreeNode current=root;
        
        while(current!=null || !stack.isEmpty()){
            while(current!=null){
                stack.push(current);
                current=current.left;
            }
            current=stack.pop();
            outputArr.add(current.val);
            current=current.right;
        }
        return outputArr;
    }
}