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
//     public voif f(TreeNode root,List<Integer> ans){
//     }
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> res = new ArrayList<>();
//         Stack<TreeNode> stack = new Stack<>();

//         while (root != null || !stack.isEmpty()) {
//             while (root != null) {
//                 stack.push(root);
//                 root = root.left;
//             }

//             root = stack.pop();
//             res.add(root.val);
//             root = root.right;
//         }

//         return res;        
//     }
// }




//another soln:
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
        //left
        f(root.left,ans);
        ans.add(root.val);
        //right
        f(root.right,ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List< Integer> ans= new ArrayList<>();
        f(root,ans);
        return ans;
    }
}

