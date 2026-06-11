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
    public void f(TreeNode root, List<Integer> ans){
        if(root==null) return;
        ans.add(root.val);//root
        f(root.left,ans);//left
        f(root.right,ans);//right
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans =new ArrayList<>();
        f(root,ans);
        return ans;
    }
}