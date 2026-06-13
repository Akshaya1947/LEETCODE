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

    public int amountOfTime(TreeNode root, int start) {
        HashMap<TreeNode,TreeNode> mp=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        TreeNode target=new TreeNode();
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node.val==start){
                target=node;
            }
            if(node.left!=null){
                mp.put(node.left,node);
                q.offer(node.left);
            }
            if(node.right!=null){
                mp.put(node.right,node);
                q.offer(node.right);
            }
        }
        // vis hasmap -> nodes which are already visited
        HashMap<TreeNode,Boolean> vis =new HashMap<>();
        // start the level order traversal from the target
        int l=0;
        q.offer(target);
        vis.put(target,true);
        while(!q.isEmpty()){
            int ele=q.size();
            for(int i=0;i<ele;i++){
                TreeNode node=q.poll();
                // left 
                if(node.left!=null && !vis.containsKey(node.left)){
                    q.offer(node.left);
                    vis.put(node.left,true);
                }
                // right
                if(node.right!=null && !vis.containsKey(node.right)){
                    q.offer(node.right);
                    vis.put(node.right,true);
                }
                //parent
                if(mp.containsKey(node) && !vis.containsKey(mp.get(node))) {
                    q.offer(mp.get(node));
                    vis.put(mp.get(node),true);
                }
            }
            l++; // after level order traversal increment it
        }
       return l-1;

    }
}