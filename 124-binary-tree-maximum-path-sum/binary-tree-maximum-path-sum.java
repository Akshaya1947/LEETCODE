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
//     int maxi=Integer.MIN_VALUE;
//     int f(TreeNode root){
//       //if all node is negative return min negative value which will be max among all nodes
//       //even a single node is also considered
      
//         if(root==null)return 0;
//         int ls=f(root.left);
//         int rs=f(root.right);
//         if(ls<0)ls=0;//if it is negative make it as zero
//         if(rs<0)rs=0;
//         int sum=ls+rs+root.val;
//         maxi=Math.max(maxi,sum);
//         return Math.max(ls,rs)+root.val;
//     }

//     public int maxPathSum(TreeNode root) {
//         int ans=f(root);
//         return maxi;
//     }
// }




// if you are not declaring the maxi as global variable
class Solution {
    public int f(TreeNode root, int[] maxi){
        if(root==null) return 0;
        int ls=f(root.left,maxi);
        int rs=f(root.right,maxi);
        if(ls<0) ls=0;
        if(rs<0) rs=0;
        int curr=root.val+ls+rs;
        maxi[0]=Math.max(maxi[0],curr);
        return root.val+Math.max(ls,rs);
    }
    public int maxPathSum(TreeNode root) {
        int[] maxi=new int[1];
        maxi[0]=Integer.MIN_VALUE;
        int h=f(root,maxi);
        return maxi[0];
    }
}