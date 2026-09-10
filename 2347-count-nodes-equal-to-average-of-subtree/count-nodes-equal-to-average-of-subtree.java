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
    public int averageOfSubtree(TreeNode root) {
        int c1=0;
        TreeNode root1=root;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            TreeNode poll=queue.poll();
            if(sum(poll))c1++;
            if(poll.left!=null)queue.offer(poll.left);
            if(poll.right!=null)queue.offer(poll.right);
        }
        return c1;
    }
   
    public boolean sum(TreeNode root){
        int val=root.val;
        int count=0;
        int sum=0;
        TreeNode root1=root;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root1);
        
        while(!queue.isEmpty()){
            TreeNode poll=queue.poll();
            sum+=poll.val;
            count++;
            if(poll.left!=null)queue.offer(poll.left);
            if(poll.right!=null)queue.offer(poll.right);
        }
        return val==(sum/count);
    }
}