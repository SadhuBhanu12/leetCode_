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
    ArrayList<Integer> list=new ArrayList<>();
    public void inorder(TreeNode root){
        if (root!=null){
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }
    }
    public int findSecondMinimumValue(TreeNode root) {
        inorder(root);
        TreeSet<Integer> set=new TreeSet<>();
        for (int i=0;i<list.size();i++){
            set.add(list.get(i));
        }
        ArrayList<Integer> list2=new ArrayList<>();
        for (int i:set){
            list2.add(i);
        }
        if (list2.size()<=1)return -1;
        return list2.get(1);
    }
}