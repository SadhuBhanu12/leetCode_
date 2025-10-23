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
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        level(root);
        return dia;
    }
    public int level(TreeNode root){
        if (root==null)return 0;
        int leftsum=level(root.left);
        int rightsum=level(root.right);
        dia=Math.max(dia,leftsum+rightsum);
        return 1+Math.max(leftsum,rightsum);
    }
}