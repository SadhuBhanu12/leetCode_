/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<Node> queue=new LinkedList<>();
        if(root==null)return new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
            Node poll1=queue.poll();
            list.add(poll1.val);
            List<Node> list1=poll1.children;
            for(int j=0;j<list1.size();j++){
                queue.offer(list1.get(j));
            }
            }
            res.add(list);
        }
return res;
    }
}