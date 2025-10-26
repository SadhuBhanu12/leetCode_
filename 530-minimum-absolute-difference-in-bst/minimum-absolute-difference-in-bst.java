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
    ArrayList<Integer>list=new ArrayList<>();
    public void inorder(TreeNode root){
        if (root!=null){
            inorder(root.left);
           list.add(root.val);
            inorder(root.right);
        }
    }
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        int min=Integer.MAX_VALUE;
        for (int i=0;i<list.size();i++){
            for (int j=0;j<list.size();j++){
                if (i!=j)min=Math.min(Math.abs(list.get(i)-list.get(j)),min);
            }
        }
        return min;
    }
}