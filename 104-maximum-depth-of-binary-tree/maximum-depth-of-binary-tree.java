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
// class Solution {
//     public int maxDepth(TreeNode root) {
//         if (root == null) {
//             return 0;
//         }
//         return 1 + Math.max(maxDepth(root.left), maxDepth(root.right)); // root node ah yum include pannanum so add 1
//     }
// }
class Solution{
    int f(TreeNode root){
        if(root==null) return 0;
        int lh=f(root.left);
        int rh=f(root.right);
        return 1+Math.max(lh,rh);
    }
    public int maxDepth(TreeNode root){
        int ans=f(root);
        return ans;
    }
}