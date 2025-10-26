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
    HashMap<Integer,Integer> map=new HashMap<>();
    public void inorder(TreeNode root){
        if (root!=null){
            inorder(root.left);
            map.put(root.val,map.getOrDefault(root.val,0)+1);
            inorder(root.right);
        }
    }
    public int[] findMode(TreeNode root) {
        inorder(root);
        int max1=0;
        int count=0;
        for (int i:map.values()){
            max1=Math.max(max1,i); 
        }
        for (int i:map.values()){
            if (i==max1)count++;
        }
        int arr[]=new int[count];
        int c=0;
        for (int key : map.keySet()) {
    if (map.get(key) == max1) {
        arr[c++] = key;
    }
}

    return arr;


    }
}