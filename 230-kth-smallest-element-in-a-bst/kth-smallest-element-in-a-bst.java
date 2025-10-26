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
   PriorityQueue<Integer> pq=new PriorityQueue<>();
    public void inorder(TreeNode root){
        if (root!=null){
            inorder(root.left);
            pq.offer(root.val);
            inorder(root.right);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        
        int c=0;
        int res=0;
        while(c!=k){
            res=pq.poll();
            c++;
        }
        return res;
    }
}