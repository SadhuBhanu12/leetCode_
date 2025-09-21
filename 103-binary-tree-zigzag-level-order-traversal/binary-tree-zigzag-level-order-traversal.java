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
        Queue<TreeNode > queue=new LinkedList<>();
        List<List<Integer>> list1=new ArrayList<>();
        if (root==null)return list1;
        queue.offer(root);
        int lev=1;
        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayList<Integer> list=new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode poll1=queue.poll();
                list.add(poll1.val);
                if (poll1.left!=null){
                    queue.offer(poll1.left);
                }
                if (poll1.right!=null){
                    queue.offer(poll1.right);
                }
            }
            if (lev%2==0){
                Collections.reverse(list);
                list1.add(list);
                lev++;
            }
            else {
                list1.add(list);
                lev++;
            }

        }
        return list1;
    }
}