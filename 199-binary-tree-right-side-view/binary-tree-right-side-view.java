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
    public List<Integer> rightSideView(TreeNode root) {
        if (root==null)return new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for (int i=0;i<size;i++){
            TreeNode poll1=queue.poll();
            if (i==(size-1))list.add(poll1.val);
            if (poll1.left!=null)queue.offer(poll1.left);
            if (poll1.right!=null)queue.offer(poll1.right);
            }
        }
        return list;
    }
}