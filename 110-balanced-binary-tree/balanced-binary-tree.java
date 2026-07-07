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
   int  f(TreeNode root){
        if(root==null) return 1;
        int lh=f(root.left);
        int rh=f(root.right);
        if(lh==-1)return -1;//if the left subtree is unbalanced
        if(rh==-1)return -1;//if the right subtree is unbalanced
        if(Math.abs(lh-rh)>1){//if the root is unbalanced
            return -1;
        }
        return 1+Math.max(rh,lh);//if balanced return the max length left subtree or right subtree
    }
    public boolean isBalanced(TreeNode root) {
        int ans=f(root);
        return (ans!=-1);//if it is not -1 (which is unbalanced) it return true else false
    }
}