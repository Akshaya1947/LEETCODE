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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //for even level the order is for odd level you have reverse
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q =new LinkedList<>();
        q.offer(root);
        int l=0;
        while(!q.isEmpty()){
            int ele =q.size();//check for no of elements in the level
            List<Integer> temp =new ArrayList<>();
            for(int i=0;i<ele;i++){ //if the level contains 4 elements the loop executes four time and addit to the temp if loop terminates the temp added to the ans
                TreeNode node = q.poll(); //pop the elment and add it to the node
                temp.add(node.val);//adding it to the temp
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            if(l%2==1) Collections.reverse(temp); // it will reverse for the odd position values
            ans.add(temp);
            l++;
        }
        return ans;
    }
}