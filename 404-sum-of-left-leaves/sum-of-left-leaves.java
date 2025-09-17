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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        Queue<TreeNode> a=new LinkedList<>();
        a.offer(root);
        while(!a.isEmpty()){
            TreeNode poll1=a.poll();
            
            if (poll1.left!=null){
                TreeNode left1=poll1.left;
                if (left1.left==null && left1.right==null){
                    sum+=(left1.val);
                }
                a.offer(poll1.left);
            }
            if (poll1.right!=null){
                a.offer(poll1.right);
            }
        }
        return sum;
    }
}