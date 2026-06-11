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
        int c=0;
    int f(TreeNode root){
        //number of edges between them is the length.
        if(root==null)return 0;
       int lh= f(root.left);
        int rh=f(root.right);
        int d=lh+rh;
        c=Math.max(c,d);//whenever the diameter is high update in c and return
        return 1+Math.max(lh,rh);//this will return height because that will indicate that there is anode in left or right side 


    }
    public int diameterOfBinaryTree(TreeNode root) {
        int ans =f(root);
        return c;
    }
}