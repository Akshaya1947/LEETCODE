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
    int maxi=Integer.MIN_VALUE;
    int f(TreeNode root){
      //if all node is negative return min negative value which will be max among all nodes
      //even a single node is also considered
      
        if(root==null)return 0;
        int ls=f(root.left);
        int rs=f(root.right);
        if(ls<0)ls=0;//if it is negative make it as zero
        if(rs<0)rs=0;
        int sum=ls+rs+root.val;
        maxi=Math.max(maxi,sum);
        return Math.max(ls,rs)+root.val;
    }

    public int maxPathSum(TreeNode root) {
        int ans=f(root);
        return maxi;
    }
}