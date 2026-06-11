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
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> list=new ArrayList<>();
//         if(root==null)return list;
//         helper(root,list);
//         return list;
//     }
//     public void helper(TreeNode root,List<Integer>list){
//         if(root==null)return;
//         helper(root.left,list);
//         helper(root.right,list);
//         list.add(root.val);
//     }
// }



class Solution {
    public void f(TreeNode root, List<Integer> ans){
        if(root==null) return;
        f(root.left,ans);//left
        f(root.right,ans);//right
        ans.add(root.val);//root
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans =new ArrayList<>();
        f(root,ans);
        return ans;
    }
}